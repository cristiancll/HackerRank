package com.hackerrank.solutions.basic;

enum Operation{
    SPLIT,
    COMBINE
}

enum Type{
    METHOD,
    VARIABLE,
    CLASS
}

class Input {
    private String sourceContent;
    private Type type;
    private Operation operation;

    public Input(Operation operation, Type type, String sourceContent){
        this.operation = operation;
        this.type = type;
        this.sourceContent = sourceContent;
    }
    public String convert() {
        return operation == Operation.COMBINE ? combine() : split();
    }
    private String combine(){
        String[] contentSplit = sourceContent.split(" ");
        String result = "";
        for(int i = 0; i < contentSplit.length; i++){
            String word = contentSplit[i];
            if(i == 0 && (type == Type.METHOD || type == Type.VARIABLE)) result = word.toLowerCase();
            else{
                result += word.substring(0, 1).toUpperCase();
                result += word.substring(1).toLowerCase();
            }
        }
        if(type == Type.METHOD) result = result + "()";
        return result;
    }
    private String split(){
        if(type == Type.METHOD) sourceContent = sourceContent.substring(0, sourceContent.indexOf("("));
        
        String result = "";
        char[] charArray = sourceContent.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            char c = charArray[i];
            if(i == 0 && type == Type.CLASS){
                result += Character.toLowerCase(c);
                continue;
            }
            if(Character.isLowerCase(c)){
                result += c;
                continue;
            }
            result += " "+Character.toLowerCase(c);
        }
        return result;
    }
}

public class CamelCaseFour {
    public String answer(String inputStream){
        String[] split = inputStream.split(";");
        
        Operation operation = split[0].equalsIgnoreCase("S") ? Operation.SPLIT : Operation.COMBINE;
        
        Type type;
        if(split[1].equalsIgnoreCase("M")) type = Type.METHOD;
        else if(split[1].equalsIgnoreCase("V")) type = Type.VARIABLE;
        else type = Type.CLASS;
        
        String sourceContent = split[2];
        
        Input input = new Input(operation, type, sourceContent);
        return input.convert();
    }
}