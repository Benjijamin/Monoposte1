package chainage;

public class MainPile {

	public static void main(String[] args) {
		Pile p = new Pile();
		Integer i = null;

		p.push(new Integer(34));
		p.push(new Integer(23));
		p.push(new Integer(345));
		p.push(new Integer(123));

		System.out.println("[" + p + "] : " + p.isEmpty() + " \n");
		p.clear();
		System.out.println("[" + p + "] : " + p.isEmpty() + " \n");
		
		p.push(new Integer(34));
		p.push(new Integer(23));
		p.push(new Integer(345));
		p.push(new Integer(123));

		System.out.println(p);

		i = (Integer) p.pop();
		System.out.println(i + " <== \n" + p);
		i = (Integer) p.pop();
		System.out.println(i + " <== \n" + p);
		i = (Integer) p.pop();
		System.out.println(i + " <== \n" + p);
		i = (Integer) p.pop();
		System.out.println(i + " <== \n" + p);
		i = (Integer) p.pop();
		System.out.println(i + " <== \n" + p);
	}
}
