package pet;
import java.util.Scanner;
import java.util.Random;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		Random rand = new Random();
		String userName;
		String animalName;
		String help;
		int yourAnswer;
		int alive=100;
		int feeding = 1;
		int water =2;
		int walk = 3;
		int play = 4;
		int discipline = 5;
		int gameOver=6;
		//introducing the user to the game
		System.out.println("Welcome to animal simulator");
		System.out.println("What is your name friend?");
		userName= input.nextLine();
		System.out.println("Hello"+ " "+userName+" "+"let's pick an animail for you");
		//begin building out the game & selecting a pet
		String[] pets= {"Dog", "Snake", "Bird","Lion","Donkey"};
		//This is here to check the array 
		int x = pets.length;
		System.out.println("There are"+" "+pets.length+" "+ "in this game");
		//Using a Randomizer to select the animal for the user
		int select = rand.nextInt(pets.length);
		System.out.println("You are now the proud parent of a"+ " "+ pets[select]);
		// Now building the nature of the pet by creating a new class
		System.out.println("please name your"+ " "+" "+ pets[select]);
		animalName=input.nextLine();
		System.out.println("Ok"+" "+ userName+ " "+ "So What would you like to do with"+ " "+ animalName+" "+"the"+" "+ pets[select]);
		System.out.println("Type \"help\" for a list of options");
		help=input.nextLine();
		
	
		// These are the controls for interacting with your pet 
			if (help.equals("help")) {
			System.out.println("choose"+" "+ 1 +" "+ "for feeding your pet");
			System.out.println("choose"+" "+ 2 +" "+ "to give water to your pet");
			System.out.println("choose"+" "+ 3 +" "+"to walk your pet");
			System.out.println("choose"+" "+ 4 +" "+ "to play with your pet");
			System.out.println("choose"+" "+ 5 +" "+"to discipline your pet");
			System.out.println("choose"+" "+ 6 +" "+ "to end the game");
			}
			yourAnswer=input.nextInt();
			/**inputing an object to link VirtualPet to the VirtualPetApp
			to call the class I had to create a new object name "animal" & link strings and int
			to VirtualPet from line below next steps was to add getter method...getterdone!!!*/
			VirtualPet friend = new VirtualPet(pets[select],"Health:",100,"Happiness:",100);
			System.out.println("Your"+" "+ friend.getanimal());
			System.out.println("Your"+" "+ friend.gethealth());
			System.out.println( friend.getl());
			System.out.println("Your"+" "+ friend.gethappiness());
			System.out.println( friend.gete());
			
			//Call Tick class to link App to Time 
			
			do {
				if  (yourAnswer==1) {
					alive+=15;
					
				if(alive<80) {
				System.out.println("your pet is in need of food and drink");
				}
				if(alive<70) {
					System.out.println("your pet is unhappy");
				}
				else {
					System.out.println("What do you want to do next with your pet"+" "+userName);
				}
			yourAnswer=input.nextInt();
			}
			
				if  (yourAnswer==2) {
					alive +=10;
					
					System.out.println("your pet's level is"+" "+ alive);
					if(alive<80) {	
						System.out.println(animalName+" "+"is still thirsty");				}
					if(alive<70) {
						System.out.println("your pet is unhappy");
					}
					else {
						System.out.println("your pet is not hungry or thirsty");
					}
				yourAnswer=input.nextInt();
				}
	
	
				if  (yourAnswer==3) {
					
					
					System.out.println("exercise is important for"+ " "+animalName+" "+"happiness increased to"+" "+(alive+=10));
				
					if(alive<60) {
						System.out.println("your pet is unhappy");
					}
					if(alive<80) {
						System.out.println("your pet is hungry or thirsty");
					}
				yourAnswer=input.nextInt();
				}
					if  (yourAnswer==4) {
					
					
					System.out.println("Playing bulids an important bond between you and"+ " "+animalName+" "+" enegry level is"+ alive);
										alive-=20;
					if(alive<60) {
						System.out.println("your pet is unhappy");
					}
					if(alive<70) {
						System.out.println("maybe you should feed"+animalName);
					}
					else {
						System.out.println("your pet would like to exercise");
					}
				
						yourAnswer=input.nextInt();
	}    
					
					if  (yourAnswer==5) {
						
						
						System.out.println(animalName+ "doesn't like to be punished your happiness is"+ alive);
											alive-=50;
						if(alive<60) {
							System.out.println("your pet is unhappy");
						}
						else {
							System.out.println("your pet is sad");
						}
					
						yourAnswer=input.nextInt();
				if(alive<30) {
					System.out.println("unfornately you killed your pet");
					break;
				}
		}
			}	while (yourAnswer!=6||alive<=30); 
				System.out.println("Game over");
			
			
			
}
}

