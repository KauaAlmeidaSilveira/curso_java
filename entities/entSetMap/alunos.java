package entSetMap;


public class alunos implements Comparable<alunos>{

	private Integer id;

	
	public alunos(Integer id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {	
		return "id: "+ id;
	}

	@Override
	public int compareTo(alunos o) {
		return id.compareTo(o.getId());
	}
	
}
