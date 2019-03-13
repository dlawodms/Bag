package ArrayBag;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayBag ab = new ArrayBag();
		System.out.println("* Hi 원소 추가");
		ab.add("Hi");
		ab.printAll();
		System.out.println();
		System.out.println("* Hi 원소 삭제");
		ab.remove("Hi");
		ab.printAll();
		System.out.println();
		System.out.println("* ArrayBag이 비었나?");
		System.out.println(ab.isEmpty());
		System.out.println("* 원소 추가");
		ab.add("임재은");
		ab.add("임재은");
		ab.add("201802149");
		ab.printAll();
		System.out.println();
		System.out.println("* 원소 개수 출력");
		System.out.println(ab.size());
		System.out.println("* 학번이 Bag에 존재하는가?");
		System.out.println(ab.contains("201802149"));
		System.out.println("* 첫번째 원소 삭제");
		ab.removeFirst();
		ab.printAll();
	}

}
