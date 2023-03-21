package second_package;

public class Butterflypattern {
	public static void main(String[] args) {
	int a,b,c,i,j,k,l,m,n,o,p;
	
	for(i=1;i<=6;i++) {
		for(j=1;j<=i;j++) {
			System.out.print("* ");}
		if (i==1 | i==12) {
		for(k=1;k<=20;k++) {
			System.out.print(" ");}}
		else if(i==2 | i==11) {
			for(l=1;l<=16;l++) {
				System.out.print(" ");}}	
		else if(i==3 | i==10) {
			for(m=1;m<=12;m++) {
				System.out.print(" ");}}
		else if(i==4 | i==9) {
			for(n=1;n<=8;n++) {
				System.out.print(" ");}}
		else if(i==5 | i==8) {
			for(a=1;a<=4;a++) {
				System.out.print(" ");}}
		for(o=i;o<=i;o++) {
			for(p=1;p<=o;p++) {
				System.out.print(" *");}}
		System.out.println();
			}
	for(i=7;i<=12;i++) {
		for(j=i;j<=12;j++) {
			System.out.print("* ");}
		if (i==1 | i==12) {
		for(k=1;k<=20;k++) {
			System.out.print(" ");}}
		else if(i==2 | i==11) {
			for(l=1;l<=16;l++) {
				System.out.print(" ");}}	
		else if(i==3 | i==10) {
			for(m=1;m<=12;m++) {
				System.out.print(" ");}}
		else if(i==4 | i==9) {
			for(n=1;n<=8;n++) {
				System.out.print(" ");}}
		else if(i==5 | i==8) {
			for(a=1;a<=4;a++) {
				System.out.print(" ");}}
		for(o=i;o<=i;o++) {
			for(p=o;p<=12;p++) {
				System.out.print(" *");}}
		System.out.println();
			}
		}
			
}
		
		

	

	
