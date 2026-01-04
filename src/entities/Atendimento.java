package entities;

import java.util.Date;
import java.util.UUID;

public class Atendimento {

	private UUID id;
	private Date DataHora;
	private String nomeUsuario;
	private String pergunta;
	private String resposta;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Date getDataHora() {
		return DataHora;
	}

	public void setDataHora(Date dataHora) {
		DataHora = dataHora;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	@Override
	public String toString() {
		return "Atendimento [id=" + id + ", DataHora=" + DataHora + ", nomeUsuario=" + nomeUsuario + ", pergunta="
				+ pergunta + ", resposta=" + resposta + "]";
	}

}
