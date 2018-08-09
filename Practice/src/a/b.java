package a;

class c {
	
	public int x =3;
	
}


class a extends c {
	public int x =5;
	
}

class b {
	
	public static void main(String[] args) {
		
		c c = new a();
		
		System.out.println(c.x);
	}
}