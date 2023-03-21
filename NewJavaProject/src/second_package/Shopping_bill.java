package second_package;

public class Shopping_bill {
	int item1;
	int item2;
	int item3;
	int item4;
	int item5;
public void sugar (int sn) {
	int psu = 40;
	item1 = psu;
	System.out.println(sn + "." +"Sugar         "+ psu );
}
public void rice(int sn) {
	int pri = 50;
	item2 = pri;
	System.out.println(sn + "." + "Rice          "+ pri);
}
public void soap(int sn) {
	int pso = 60;
	item3 = pso;
	System.out.println(sn + "." + "Soap          "+ pso);
}
public void dal(int sn) {
	int pda = 70;
	item4 = pda;
	System.out.println(sn + "." + "Dal           "+ pda);
}
public void oil(int sn) {
	int poi = 60;
	item5 = poi;
	System.out.println(sn + "." + "Oil           "+ poi);
}
public void tot() {
	System.out.println("Total         "+ (item1+item2+item3+item4+item5));
}
}
