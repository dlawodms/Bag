package ArrayBag;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayBag ab = new ArrayBag();
		System.out.println("* Hi ���� �߰�");
		ab.add("Hi");
		ab.printAll();
		System.out.println();
		System.out.println("* Hi ���� ����");
		ab.remove("Hi");
		ab.printAll();
		System.out.println();
		System.out.println("* ArrayBag�� �����?");
		System.out.println(ab.isEmpty());
		System.out.println("* ���� �߰�");
		ab.add("������");
		ab.add("������");
		ab.add("201802149");
		ab.printAll();
		System.out.println();
		System.out.println("* ���� ���� ���");
		System.out.println(ab.size());
		System.out.println("* �й��� Bag�� �����ϴ°�?");
		System.out.println(ab.contains("201802149"));
		System.out.println("* ù��° ���� ����");
		ab.removeFirst();
		ab.printAll();
	}

}
