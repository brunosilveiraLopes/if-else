	import java.util.Scanner;
	
	public class Programa {
	    public static void main(String[] args){
	        
	        Scanner s = new Scanner(System.in);
	 
	        
	        String[] perguntas = new String[5];
	            perguntas[0] = "Telefonou para a v�tima?";
	            perguntas[1] = "Esteve no local do crime?";
	            perguntas[2] = "Mora perto da v�tima?";
	            perguntas[3] = "Devia para a v�tima?";
	            perguntas[4] = "J� trabalhou com a v�tima?";
	       
	        
	        int respostasPositivas = 0;
	       
	        
	     
	        for(int i = 0; i < perguntas.length; i++){
	            System.out.println(perguntas[i]);
	            String respostas = s.nextLine();
	           
	            
	            
	            if(respostas.toLowerCase().equals("sim")){ 
	                respostasPositivas++;
	            }
	        }
	 
	      
	        switch(respostasPositivas){
	            case 2:
	                System.out.println("Suspeito Eim meu chapa!");
	                break;
	 
	            case 3: 
	            case 4:
	                System.out.println("C�mplice seu safado (??)");
	                break;
	 
	            case 5:
	                System.out.println("Assassino vai pra cadeia!");
	                break;
	 
	            default:
	                System.out.println("Inocente meu chapa vai embora!");
	                break;
	        }
	    }
	}

