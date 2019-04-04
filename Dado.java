class Dado{
	private int valor;
	public Dado(){
	}

	public int tirarDado(){
		//Devuelve un valor aleatorio al dado entre el 1 y el 6
		this.valor=(int)((Math.random()*6)+1);
		return this.valor;
	}
	public int getValor(){
		return this.valor;
	}
}

