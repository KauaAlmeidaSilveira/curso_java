package entInterfaces;

import java.util.Date;

public class aluguelCarro {

	private Date start;
	private Date finish;
	
	private veiculo veiculo;
	private fatura fatura;
	
	public aluguelCarro() {

	}

	public aluguelCarro(Date start, Date finish, veiculo veiculo) {
		this.start = start;
		this.finish = finish;
		this.veiculo = veiculo;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getFinish() {
		return finish;
	}

	public void setFinish(Date finish) {
		this.finish = finish;
	}

	public veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public fatura getFatura() {
		return fatura;
	}

	public void setFatura(fatura fatura) {
		this.fatura = fatura;
	}
	 
	
	
}
