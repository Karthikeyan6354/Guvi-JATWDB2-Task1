package javaWDB2;

public class Arrayclas {

	public static void main(String[] args) {
		//Arrays should be used when multiple values need to stored into one variable 
        // Arrays r fixed length , once defined u cannot add more items to exisiting array
		//String[] flowers= {"Rose","Jasmin","Jerbera", "Lotus"};
		
		//int[] num= {4,7,8,9};
		
		String flowers[]=new String[4];
		flowers[0]="Rose";
		flowers[1]="Jasmin";
		flowers[2]="Jerbera";
		flowers[3]="Lotus";
		
		String flowerss[]= {"Rose","Jasmin","Jerbera", "Lotus"};
		
		System.out.println(flowers[3]);
		
		flowers[2]="Mogra";
		System.out.println(flowers[2]);
		
		System.out.println(flowers.length);
		
		for (int i=0; i<flowers.length;i++ ) {
			System.out.println(flowers[i]);
		}
		
		flowers[4]="Jui";
	}

}
