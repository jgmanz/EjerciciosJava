package ejercicios;

public class Horario {
	

	private String horainicial;
	private String horafinal;
	private String materia;
	private String diaSemana;
	
	public Horario()
	{
		
	}
	public Horario(String horainicial, String horafinal, String materia, String diaSemana) {
		super();
		this.horainicial = horainicial;
		this.horafinal = horafinal;
		this.materia = materia;
		this.diaSemana = diaSemana;
	}
	public String getHorainicial() {
		return horainicial;
	}
	public void setHorainicial(String horainicial) {
		this.horainicial = horainicial;
	}
	public String getHorafinal() {
		return horafinal;
	}
	public void setHorafinal(String horafinal) {
		this.horafinal = horafinal;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	
	

}
