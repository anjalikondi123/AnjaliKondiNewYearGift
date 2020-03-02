package epamtasks.NewYear;

import java.util.ArrayList;
import java.util.*;
public class NewYearGift{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Sweets> ls = new ArrayList<>();
        ls.add(new chocos("DairyMilk",50,20.5f,60));
		ls.add(new chocos("MilkyBar",20,10.2f,40));
		ls.add(new chocos("FiveStar",30,21.5f,55));
		ls.add(new chocos("KitKat",60,30.2f,65));
		ls.add(new JellyBeans("JustJelly",5,5.1f,45));
		ls.add(new JellyBeans("JollyRancher",10,5.1f,50));
		ls.add(new JellyBeans("JellyBelly",15,7.5f,65));
		ls .add(new Candy("Hershey's_Kisses",60,8.1f,90));
		ls.add(new Candy("LaffyTaffy",90,30.1f,75));
		ls.add(new Candy("Nerds",10,2.6f,10));
		ls.add(new Candy("MilkyWay",30,15.6f,25));
        ls.add(new Candy("DoubleBubbleGum",5,3.0f,15));
        List<Sweets> choco = new ArrayList<>();
        float totalWeight = 0;
        for(Sweets s: ls)
            totalWeight+=s.weight;
        System.out.println("\nTotal Weight of the Gift is : "+totalWeight);
        for(Sweets s: ls){
            if(s instanceof chocos)
                choco.add(s);
        }
        System.out.println("\nLet's get to sorting......\n");
        System.out.println("Enter your choice to sort based on :\n");
        System.out.println("1.Cost\n2.Weight\n3.SweetContent\n");
        int op = sc.nextInt();
        if(op == 1)Collections.sort(choco,new sortByCost());
        else if(op == 2)Collections.sort(choco,new sortByWeight());
        else Collections.sort(choco,new sortBySweetContent());
        System.out.println("Chocolates Present in the Gift are:");
		for(Sweets s:choco){
			System.out.println(s.name+" "+s.cost+" "+s.weight+" "+s.sweetContent);
		}
		System.out.println("Do you Want List of Candies(y/n)");
		char c=sc.next().charAt(0);
		if(c=='y'){
			System.out.print("Enter the Option :\n1.Cost\n2.Weight\n3.SweetContent\n");
			op=sc.nextInt();
			System.out.println("Enter the Range");
			int min=sc.nextInt();
			int max=sc.nextInt();
			if(op==1) {
				for(Sweets cur:ls) {
					if(cur instanceof Candy && cur.cost>=min && cur.cost<=max){
						System.out.println(cur.name+" "+cur.cost+" "+cur.weight+" "+cur.sweetContent);
					}
				}
			}
			else if(op==2) {
				for(Sweets cur:ls) {
					
					if(cur instanceof Candy && cur.weight>=min && cur.weight<=max){
						System.out.println(cur.name+" "+cur.cost+" "+cur.weight+" "+cur.sweetContent);
					}
				}
			}
			else {
				for(Sweets cur:ls) {
					
					if(cur instanceof Candy && cur.sweetContent>=min && cur.sweetContent<=max){
						System.out.println(cur.name+" "+cur.cost+" "+cur.weight+" "+cur.sweetContent);
					}
				}
			}
		}
		sc.close();
	}
}

