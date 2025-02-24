import java.util.HashMap;
import java.util.Map;

public class Registradores {
    
    public String registerInt(String inputString, int inputType){ 
        String input = inputString;
        int type = inputType; 
        Map<String,String> RegisterDisplay = new HashMap<String,String>();
        RegisterDisplay.put("0","$0");
        RegisterDisplay.put("1","$1");
        RegisterDisplay.put("2","$2");
        RegisterDisplay.put("3","$3");
        RegisterDisplay.put("4","$4");
        RegisterDisplay.put("5","$5");
        RegisterDisplay.put("6","$6");
        RegisterDisplay.put("7","$7");
        RegisterDisplay.put("8","$8");
        RegisterDisplay.put("9","$9");
        RegisterDisplay.put("10","$10");
        RegisterDisplay.put("11","$11");
        RegisterDisplay.put("12","$12");
        RegisterDisplay.put("13","$13");
        RegisterDisplay.put("14","$14");
        RegisterDisplay.put("15","$15");
        RegisterDisplay.put("16","$16");
        RegisterDisplay.put("17","$17");
        RegisterDisplay.put("18","$18");
        RegisterDisplay.put("19","$19");
        RegisterDisplay.put("20","$20");
        RegisterDisplay.put("21","$21");
        RegisterDisplay.put("22","$22");
        RegisterDisplay.put("23","$23");
        RegisterDisplay.put("24","$24");
        RegisterDisplay.put("25","$25");
        RegisterDisplay.put("26","$26");
        RegisterDisplay.put("27","$27");
        RegisterDisplay.put("28","$28");
        RegisterDisplay.put("29","$29");
        RegisterDisplay.put("30","$30");
        RegisterDisplay.put("31","$31");

        if(type==0){
            if ( RegisterDisplay.containsKey(input) ) return RegisterDisplay.get(input);

        }else 
        if(type==1){

            for (String key : RegisterDisplay.keySet()) {
                String value = RegisterDisplay.get(key);
                if(value.equalsIgnoreCase(input)) return key;
            }
            
         }
         return "Chave nao existe";
    }
  
    
    public String register(String inputString, String inputType){ 
        String input = inputString;
        String type = inputType; 
        Map<String,String> Register = new HashMap<String,String>();
        Register.put("0","$r0");
        Register.put("1","$at");
        Register.put("2","$v0");
        Register.put("3","$v1");
        Register.put("4","$a0");
        Register.put("5","$a1");
        Register.put("6","$a2");
        Register.put("7","$a3");
        Register.put("8","$t0");
        Register.put("9","$t1");
        Register.put("10","$t2");
        Register.put("11","$t3");
        Register.put("12","$t4");
        Register.put("13","$t5");
        Register.put("14","$t6");
        Register.put("15","$t7");
        Register.put("16","$s0");
        Register.put("17","$s1");
        Register.put("18","$s2");
        Register.put("19","$s3");
        Register.put("20","$s4");
        Register.put("21","$s5");
        Register.put("22","$s6");
        Register.put("23","$s7");
        Register.put("24","$t8");
        Register.put("25","$s9");
        Register.put("26","$k0");
        Register.put("27","$k1");
        Register.put("28","$gp");
        Register.put("29","$sp");
        Register.put("30","$s8");
        Register.put("31","$ra");
        if(type.equalsIgnoreCase("0")){
            if ( Register.containsKey(input) ) return Register.get(input);

        }else 

        if(type.equalsIgnoreCase("1")){

            for (String key : Register.keySet()) {
                String value = Register.get(key);

                if(value == input) return key;
            }
            
        }
         return "Chave não existe";
    }

}

