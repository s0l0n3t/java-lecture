import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean index1=false,index2=false,index3=false;
        Scanner scanner = new Scanner(System.in);
        String[] varStrings = new String[3];
        
        
        while(scanner.hasNext()){
            String varScanner = scanner.nextLine();
            for(int i = 0;i< varScanner.length();i++){
                if(varScanner.charAt(i) == '['){
                    for(int j = i;j<varScanner.length();j++){
                        if(varScanner.charAt(j) == ']'){
                            index1 = true;
                        }
                        else{
                            index1 = false;
                        }
                    }
                }
                if(varScanner.charAt(i) == '('){
                    for(int j = i;j<varScanner.length();j++){
                        if(varScanner.charAt(j) == ')'){
                            index1 = true;
                        }
                        else{
                            index1 = false;
                        }
                    }
    
                }
                if(varScanner.charAt(i) == '{'){
                    for(int j = i;j<varScanner.length();j++){
                        if(varScanner.charAt(j) == '}'){
                            index1 = true;
                        }
                        else{
                            index1 = false;
                        }
                    }
    
                }
                }
                System.out.println(index1);
        }

/*

        for(int i = 0;i< varStrings[0].length();i++){
            if(varStrings[0].charAt(i) == '['){
                for(int j = i;j<varStrings[0].length();j++){
                    if(varStrings[0].charAt(j) == ']'){
                        index1 = true;
                    }
                    else{
                        index1 = false;
                    }
                }
            }
            if(varStrings[0].charAt(i) == '('){
                for(int j = i;j<varStrings[0].length();j++){
                    if(varStrings[0].charAt(j) == ')'){
                        index1 = true;
                    }
                    else{
                        index1 = false;
                    }
                }

            }
            if(varStrings[0].charAt(i) == '{'){
                for(int j = i;j<varStrings[0].length();j++){
                    if(varStrings[0].charAt(j) == '}'){
                        index1 = true;
                    }
                    else{
                        index1 = false;
                    }
                }

            }
            }
            for(int i = 0;i< varStrings[1].length();i++){
                if(varStrings[1].charAt(i) == '['){
                    for(int j = i;j<varStrings[1].length();j++){
                        if(varStrings[1].charAt(j) == ']'){
                            index2 = true;
                        }
                        else{
                            index2 = false;
                        }
                    }
                }
                if(varStrings[1].charAt(i) == '('){
                    for(int j = i;j<varStrings[1].length();j++){
                        if(varStrings[1].charAt(j) == ')'){
                            index2 = true;
                        }
                        else{
                            index2 = false;
                        }
                    }
    
                }
                if(varStrings[1].charAt(i) == '{'){
                    for(int j = i;j<varStrings[1].length();j++){
                        if(varStrings[1].charAt(j) == '}'){
                            index2 = true;
                        }
                        else{
                            index2 = false;
                        }
                    }
    
                }
                }
        


                for(int i = 0;i< varStrings[2].length();i++){
                    if(varStrings[2].charAt(i) == '['){
                        for(int j = i;j<varStrings[2].length();j++){
                            if(varStrings[2].charAt(j) == ']'){
                                index3 = true;
                            }
                            else{
                                index3 = false;
                            }
                        }
                    }
                    if(varStrings[2].charAt(i) == '('){
                        for(int j = i;j<varStrings[2].length();j++){
                            if(varStrings[2].charAt(j) == ')'){
                                index3 = true;
                            }
                            else{
                                index3 = false;
                            }
                        }
        
                    }
                    if(varStrings[2].charAt(i) == '{'){
                        for(int j = i;j<varStrings[2].length();j++){
                            if(varStrings[2].charAt(j) == '}'){
                                index3 = true;
                            }
                            else{
                                index3 = false;
                            }
                        }
        
                    }
                    }
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
 */






        }
}
