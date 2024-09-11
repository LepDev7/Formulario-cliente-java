package model;

import java.util.Date;

public class cliente {
// Atributos
	private int id_cliente;
	private String Nome_Cli;
	private Tipo_Documento old_Tipo_Documento;
	private int Cod_Docum;
	private int Rg_Cli;
	private String Endereco;
	private String Bairro;
	private String Cidade;
	private String Estado;
	private String CEP;
	private int DDD_res;
	private String Tel_res;
	private int DDD_com;
	private String Tel_com;
	private int DDD_cel;
	private String Tel_cel;
	private String E_mail;
	private int Status_cli;
	private Date Data_cad_cli;
	
	// Construtor
	public void Cliente () {
		
	}
	
	// Metodos
	public void Efetua_pedido() {
		// Implementação do método
		System.out.println("Pedido efetuado!");
	}
	
	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNome_Cli() {
		return Nome_Cli;
	}

	public void setNome_Cli(String nome_Cli) {
		Nome_Cli = nome_Cli;
	}

	public Tipo_Documento getOld_Tipo_Documento() {
		return old_Tipo_Documento;
	}

	public void setOld_Tipo_Documento(Tipo_Documento old_Tipo_Documento) {
		this.old_Tipo_Documento = old_Tipo_Documento;
	}

	public int getCod_Docum() {
		return Cod_Docum;
	}

	public void setCod_Docum(int cod_Docum) {
		Cod_Docum = cod_Docum;
	}

	public int getRg_Cli() {
		return Rg_Cli;
	}

	public void setRg_Cli(int rg_Cli) {
		Rg_Cli = rg_Cli;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public int getDDD_res() {
		return DDD_res;
	}

	public void setDDD_res(int dDD_res) {
		DDD_res = dDD_res;
	}

	public String getTel_res() {
		return Tel_res;
	}

	public void setTel_res(String tel_res) {
		Tel_res = tel_res;
	}

	public int getDDD_com() {
		return DDD_com;
	}

	public void setDDD_com(int dDD_com) {
		DDD_com = dDD_com;
	}

	public String getTel_com() {
		return Tel_com;
	}

	public void setTel_com(String tel_com) {
		Tel_com = tel_com;
	}

	public int getDDD_cel() {
		return DDD_cel;
	}

	public void setDDD_cel(int dDD_cel) {
		DDD_cel = dDD_cel;
	}

	public String getTel_cel() {
		return Tel_cel;
	}

	public void setTel_cel(String tel_cel) {
		Tel_cel = tel_cel;
	}

	public String getE_mail() {
		return E_mail;
	}

	public void setE_mail(String e_mail) {
		E_mail = e_mail;
	}

	public int getStatus_cli() {
		return Status_cli;
	}

	public void setStatus_cli(int status_cli) {
		Status_cli = status_cli;
	}

	public Date getData_cad_cli() {
		return Data_cad_cli;
	}

	public void setData_cad_cli(Date data_cad_cli) {
		Data_cad_cli = data_cad_cli;
	}

	public void Efetua_pagamento() {
		System.out.println("Pagamento efetuado!");
	}
	
	public void Cadastra_Cliente() {
			System.out.println("Cliente cadastrado!");
		}
		
		public void Exclui_cliente() {
			System.out.println("Cliente excluido !");
		}
		
		public void Altera_dados() {
			System.out.println("Dados alterados !");
		}
		
		public void Consulta_dados() {
			System.out.println("Dados consultados!");
		}
		
	}
	
	

