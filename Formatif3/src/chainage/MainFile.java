package chainage;

public class MainFile {

	public static void main(String[] args) {
		File f = new File();
		Integer i = null;

		f.add(new Integer(34));
		f.add(new Integer(23));
		f.add(new Integer(345));
		f.add(new Integer(123));
		
		System.out.println("[" + f + "] : " + f.isEmpty() + " \n");
		f.clear();
		System.out.println("[" + f + "] : " + f.isEmpty() + " \n");
		
		f.add(new Integer(34));
		f.add(new Integer(23));
		f.add(new Integer(345));
		f.add(new Integer(123));

		System.out.println(f);

		i = (Integer) f.remove();
		System.out.println(i + " == " + f);
		i = (Integer) f.remove();
		System.out.println(i + " == " + f);
		i = (Integer) f.remove();
		System.out.println(i + " == " + f);
		i = (Integer) f.remove();
		System.out.println(i + " == " + f);
		i = (Integer) f.remove();
		System.out.println(i + " == " + f);
	}
}
