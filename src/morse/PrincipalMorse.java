package morse;

import java.util.Scanner;

public class PrincipalMorse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el mensaje a convertir");
		Scanner entrada= new Scanner(System.in);
		String cadena=entrada.nextLine();
		String salida="";
		String cadena2="";
		for (int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i)==' ' && cadena.charAt(i+1)==' ' && cadena.charAt(i+2)==' '){
				cadena2=cadena2+" $";
			}else{
				cadena2=cadena2+cadena.charAt(i);
			}
		}
		
		if(cadena.contains(".") || cadena.contains("-")){
			
			String  [] morse= cadena2.split(" ");
		
			for (int i = 0; i < morse.length; i++) {
				if(morse[i].equals(".-")){
					salida=salida+"A";
					continue;
				}
				
				if(morse[i].equals("-...")){
					salida=salida+"B";
					continue;
				}
				
				if(morse[i].equals("-.-.")){
					salida=salida+"C";
					continue;
				}
				if(morse[i].equals("-..")){
					salida=salida+"D";
					continue;
				}
				if(morse[i].equals(".")){
					salida=salida+"E";
					continue;
				}
				
				if(morse[i].equals("..-.")){
					salida=salida+"F";
					continue;
				}
				
				if(morse[i].equals("--.")){
					salida=salida+"G";
					continue;
				}
				
				if(morse[i].equals("....")){
					salida=salida+"H";
					continue;
				}
				
				if(morse[i].equals("..")){
					salida=salida+"I";
					continue;
				}
				
				if(morse[i].equals(".---")){
					salida=salida+"J";
					continue;
				}
				if(morse[i].equals("-.-")){
					salida=salida+"K";
					continue;
				}
				if(morse[i].equals(".-..")){
					salida=salida+"L";
					continue;
				}
				if(morse[i].equals("--")){
					salida=salida+"M";
					continue;
				}
				if(morse[i].equals("-.")){
					salida=salida+"N";
					continue;
				}
				
				if(morse[i].equals("---")){
					salida=salida+"O";
					continue;
				}
				if(morse[i].equals(".--.")){
					salida=salida+"P";
					continue;
				}
				
				if(morse[i].equals("--.-")){
					salida=salida+"Q";
					continue;
				}
				if(morse[i].equals(".-.")){
					salida=salida+"R";
					continue;
				}
				
				if(morse[i].equals("...")){
					salida=salida+"S";
					continue;
				}
				
				if(morse[i].equals("..-")){
					salida=salida+"U";
					continue;
				}
				
				if(morse[i].equals("...-")){
					salida=salida+"V";
					continue;
				}
				
				if(morse[i].equals(".--")){
					salida=salida+"W";
					continue;
				}
				
				if(morse[i].equals("-..-")){
					salida=salida+"X";
					continue;
				}
				
				if(morse[i].equals("-.--")){
					salida=salida+"Y";
					continue;
				}
				
				if(morse[i].equals("--..")){
					salida=salida+"Z";
					continue;
				}
				
				if(morse[i].equals(".----")){
					salida=salida+"1";
					continue;
				}
				
				if(morse[i].equals("..---")){
					salida=salida+"2";
					continue;
				}
				if(morse[i].equals("...--")){
					salida=salida+"3";
					continue;
				}
				
				if(morse[i].equals("....-")){
					salida=salida+"4";
					continue;
				}
				
				if(morse[i].equals(".....")){
					salida=salida+"5";
					continue;
				}
				
				if(morse[i].equals("-....")){
					salida=salida+"6";
					continue;
				}
				
				if(morse[i].equals("--...")){
					salida=salida+"7";
					continue;
				}
				
				if(morse[i].equals("---..")){
					salida=salida+"8";
					continue;
				}
				
				if(morse[i].equals("----.")){
					salida=salida+"9";
					continue;
				}
				
				if(morse[i].equals("-----")){
					salida=salida+"0";
					continue;
				}
				if(morse[i].equals("$")){
					salida=salida+" ";
					continue;
				}
				
				
			}
		}else{
		for (int i = 0; i < cadena.length(); i++) {
			if((cadena.charAt(i)=='A') || (cadena.charAt(i)=='a')){
				salida=salida+".- ";
				continue;
			}
			
			if((cadena.charAt(i)=='B') || (cadena.charAt(i)=='b')){
				salida=salida+"-... ";
				continue;
			}
			if((cadena.charAt(i)=='C') || (cadena.charAt(i)=='c')){
				salida=salida+"-.-. ";
				continue;
			}
			if((cadena.charAt(i)=='D') || (cadena.charAt(i)=='d')){
				salida=salida+"-.. ";
				continue;
			}
			if((cadena.charAt(i)=='E') || (cadena.charAt(i)=='e')){
				salida=salida+". ";
				continue;
			}
			if((cadena.charAt(i)=='F') || (cadena.charAt(i)=='f')){
				salida=salida+"..-. ";
				continue;
			}
			if((cadena.charAt(i)=='G') || (cadena.charAt(i)=='g')){
				salida=salida+"--. ";
				continue;
			}
			if((cadena.charAt(i)=='H') || (cadena.charAt(i)=='h')){
				salida=salida+".... ";
				continue;
			}
			if((cadena.charAt(i)=='I') || (cadena.charAt(i)=='i')){
				salida=salida+".. ";
				continue;
			}
			if((cadena.charAt(i)=='J') || (cadena.charAt(i)=='j')){
				salida=salida+".--- ";
				continue;
			}
			if((cadena.charAt(i)=='K') || (cadena.charAt(i)=='k')){
				salida=salida+"-.- ";
				continue;
			}
			if((cadena.charAt(i)=='L') || (cadena.charAt(i)=='l')){
				salida=salida+".-.. ";
				continue;
			}
			if((cadena.charAt(i)=='M') || (cadena.charAt(i)=='m')){
				salida=salida+"-- ";
				continue;
			}
			if((cadena.charAt(i)=='N') || (cadena.charAt(i)=='n')){
				salida=salida+"-. ";
				continue;
			}
			if((cadena.charAt(i)=='O') || (cadena.charAt(i)=='o')){
				salida=salida+"--- ";
				continue;
			}
			if((cadena.charAt(i)=='P') || (cadena.charAt(i)=='p')){
				salida=salida+".--. ";
				continue;
			}
			if((cadena.charAt(i)=='Q') || (cadena.charAt(i)=='q')){
				salida=salida+"--.- ";
				continue;
			}
			if((cadena.charAt(i)=='R') || (cadena.charAt(i)=='r')){
				salida=salida+".-. ";
				continue;
			}
			if((cadena.charAt(i)=='S') || (cadena.charAt(i)=='s')){
				salida=salida+"... ";
				continue;
			}
			if((cadena.charAt(i)=='T') || (cadena.charAt(i)=='t')){
				salida=salida+"- ";
				continue;
			}
			if((cadena.charAt(i)=='U') || (cadena.charAt(i)=='u')){
				salida=salida+"..- ";
				continue;
			}
			if((cadena.charAt(i)=='V') || (cadena.charAt(i)=='v')){
				salida=salida+"...- ";
				continue;
			}
			if((cadena.charAt(i)=='W') || (cadena.charAt(i)=='w')){
				salida=salida+".-- ";
				continue;
			}
			if((cadena.charAt(i)=='X') || (cadena.charAt(i)=='x')){
				salida=salida+"-..- ";
				continue;
			}
			if((cadena.charAt(i)=='Y') || (cadena.charAt(i)=='y')){
				salida=salida+"-.-- ";
				continue;
			}
			if((cadena.charAt(i)=='Z') || (cadena.charAt(i)=='z')){
				salida=salida+"--.. ";
				continue;
			}
			if((cadena.charAt(i)==' ')){
				salida=salida+"   ";
				continue;
			}
			
			if((cadena.charAt(i)=='1')){
				salida=salida+".---- ";
				continue;
			}

			if((cadena.charAt(i)=='2')){
				salida=salida+"..--- ";
				continue;
			}

			if((cadena.charAt(i)=='3')){
				salida=salida+"...-- ";
				continue;
			}

			if((cadena.charAt(i)=='4')){
				salida=salida+"....- ";
				continue;
			}

			if((cadena.charAt(i)=='5')){
				salida=salida+"..... ";
				continue;
			}

			if((cadena.charAt(i)=='6')){
				salida=salida+"-.... ";
				continue;
			}

			if((cadena.charAt(i)=='7')){
				salida=salida+"--... ";
				continue;
			}

			if((cadena.charAt(i)=='8')){
				salida=salida+"---.. ";
				continue;
			}

			if((cadena.charAt(i)=='9')){
				salida=salida+"----. ";
				continue;
			}

			if((cadena.charAt(i)=='0')){
				salida=salida+"----- ";
				continue;
			}
		}
		
		
		}
		System.out.println(salida);
	}

}
