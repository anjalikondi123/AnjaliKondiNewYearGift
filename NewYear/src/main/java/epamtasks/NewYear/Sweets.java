package epamtasks.NewYear;

import java.util.*;
class sortByCost implements Comparator<Sweets>{
	@Override
	public int compare(Sweets s1, Sweets s2) {
		return s1.Cost-s2.Cost;
	}
}
class sortByWeight implements Comparator<Sweets>{
	@Override
	public int compare(Sweets s1, Sweets s2) {
		return Float.compare(s1.Weight,s2.Weight);
	}
}
class sortBySweetContent implements Comparator<Sweets>{
	@Override
	public int compare(Sweets s1, Sweets s2) {
		return s1.SweetContent-s2.SweetContent;
	}
}


class Sweets{
    String Name;
    int Cost;
    float Weight;
    int SweetContent;
    Sweets(String name,int cost,float weight,int sweetContent){
        this.Name = name;
        this.Cost =  cost;
        this.Weight = weight;
        this.SweetContent = sweetContent;
    }

}
