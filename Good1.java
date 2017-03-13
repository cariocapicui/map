package br.edu.unifacisa.carioca.map;

import br.edu.unifacisa.carioca.map.Good1.ContaCorrente.ContaPoupanca;


class Good1 {
	  interface Conta {
	    ContaCorrente criarContaCorrente();
	    ContaPoupanca criarContaPoupanca();
	    ContaPoupanca criarNovaContaPoupanca();
	  }
	  class ContaCorrente implements Conta {
	 
	    @Override
	    public ContaCorrente criarContaCorrente() {
	        return new ContaCorrente();
	    }
	   
	  class ContaPoupanca implements Conta {
		
    	@Override
		public ContaPoupanca criarContaPoupanca() {
	    	return new ContaPoupanca();
		}

		@Override
		public ContaCorrente criarContaCorrente() {
			return null;
		}

	  }

	  @Override
	  public ContaPoupanca criarContaPoupanca() {
		  return null;
	}
	
	class NovaContaPoupanca implements Conta {
		
		@Override
		public NovaContaPoupanca criarNovaContaPoupanca() {
			return new NovaContaPoupanca();
		}
	}

	@Override
	public ContaPoupanca criarNovaContaPoupanca() {

		return null;
	}
  }

	  public static void main(String[] args) {
	    
		Conta conta = new ContaCorrente();
	    ContaCorrente contaCorrente = contaCorrente.criarContaCorrente();
	    
	    Conta conta = new ContaPoupanca();
	    ContaPoupanca contaPoupanca = contaPoupanca.criarContaPoupanca();
	    
	    Conta contaP = new NovaContaPoupanca();
	    NovaContaPoupanca novaContaPoupanca = contaP.criarNovaContaPoupanca();

	    System.out.println();
	  }
	}
