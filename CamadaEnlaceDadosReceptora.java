package camadas;

public class CamadaEnlaceDadosReceptora{
  
  public int[] CamadaEnlaceDadosReceptora(int quadro[]){
    int dados[];
    dados = CamadaDeEnlaceDadosTransmissoraEnquadramento(quadro); 
    CamadaDeEnlaceDadosTransmissoraControleDeErro(quadro);
    CamadaDeEnlaceDadosTransmissoraControleDeFluxo(quadro);
  
    CamadaDeAplicacaoReceptora(dados);
  }//fim metodo CamadaEnlanceDadosTransmissora
  
  public int[] CamadaEnlaceDadosReceptoraEnquadramento(int quadro[]){
    int tipoDeEnquadramento = 0; //alterar de acordo com o teste
    int quadroEnquadrado [];
    switch (tipoDeEnquadramento) {
      case 0 : //contagem de caracteres
        quadroEnquadrado = CamadaDeEnlaceDadosReceptoraEnquadramentoContagemDeCaracteres(quadro);
        break;
      /*case 1 : //insercao de bytes
        quadroEnquadrado = CamadaDeEnlaceDadosReceptoraEnquadramentoInsercaoDeBytes(quadro);
        break;
      case 2 : //insercao de bits
        quadroEnquadrado = CamadaDeEnlaceDadosReceptoraEnquadramentoInsercaoDeBits(quadro);
        break;
      case 3 : //violacao da camada fisica
        quadroEnquadrado = CamadaDeEnlaceDadosReceptoraEnquadramentoViolacaoCamadaFisica(quadro);
        break;*/
    }//fim do switch/case
    return quadroEnquadrado;
  }//fim do metodo CamadaEnlaceTransmissoraEnquadramento

  public int[] CamadaDeEnlaceDadosReceptoraEnquadramentoContagemDeCaracteres(int quadro []) {
    
    return quadro;
  }//fim do metodo CamadaEnlaceDadosTransmissoraContagemDeCaracteres
  public int[] CamadaDeEnlaceDadosReceptoraEnquadramentoInsercaoDeBytes (int quadro []) {

    return quadro;
  }//fim do metodo CamadaEnlaceDadosTransmissoraInsercaoDeBytes
  public int[] CamadaDeEnlaceDadosReceptoraEnquadramentoInsercaoDeBits (int quadro []) {

    return quadro;
  }//fim do metodo CamadaEnlaceDadosTransmissoraInsercaoDeBits
  public int[] CamadaDeEnlaceDadosReceptoraEnquadramentoViolacaoDaCamadaFisica (int quadro []) {

    return quadro;
  }//fim do metodo CamadaEnlaceDadosTransmissoraViolacaoDaCamadaFisica

  public void setControlador (Controlador controlador){
    control = controle;
  }//fim metodo setControlador
}//fim classe CamadaEnlaceDadosTransmissora