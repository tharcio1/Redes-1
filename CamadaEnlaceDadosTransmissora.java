package camadas;

public class CamadaEnlaceDadosTransmissora{
  
  camadaReceptora = new CamadaReceptora();
  
  public int[] CamadaEnlaceDadosTransmissora(int quadro[]){
    int dados[];
    dados = CamadaDeEnlaceDadosTransmissoraEnquadramento(quadro); 
    CamadaDeEnlaceDadosTransmissoraControleDeErro(quadro);
    CamadaDeEnlaceDadosTransmissoraControleDeFluxo(quadro);
  
    CamadaFisicaTransmissora(dados);
  }//fim metodo CamadaEnlanceDadosTransmissora
  
  public int[] CamadaEnlaceDadosTransmissoraEnquadramento(int quadro[]){
    int tipoDeEnquadramento = 0; //alterar de acordo com o teste
    int quadroEnquadrado [];
    switch (tipoDeEnquadramento) {
      case 0 : //contagem de caracteres
        quadroEnquadrado = CamadaDeEnlaceDadosTransmissoraEnquadramentoContagemDeCaracteres(quadro);
        break;
      /*case 1 : //insercao de bytes
        quadroEnquadrado = CamadaDeEnlaceDadosTransmissoraEnquadramentoInsercaoDeBytes(quadro);
        break;
      case 2 : //insercao de bits
        quadroEnquadrado = CamadaDeEnlaceDadosTransmissoraEnquadramentoInsercaoDeBits(quadro);
        break;
      case 3 : //violacao da camada fisica
        quadroEnquadrado = CamadaDeEnlaceDadosTransmissoraEnquadramentoViolacaoCamadaFisica(quadro);
        break;*/
    }//fim do switch/case
    return quadroEnquadrado;
  }//fim do metodo CamadaEnlaceTransmissoraEnquadramento

  public int[] CamadaDeEnlaceDadosTransmissoraEnquadramentoContagemDeCaracteres(int quadro []) {

    return quadro;
  }//fim do metodo CamadaEnlaceDadosTransmissoraContagemDeCaracteres
  public int[] CamadaDeEnlaceDadosTransmissoraEnquadramentoInsercaoDeBytes (int quadro []) {

    return quadro;
  }//fim do metodo CamadaEnlaceDadosTransmissoraInsercaoDeBytes
  public int[] CamadaDeEnlaceDadosTransmissoraEnquadramentoInsercaoDeBits (int quadro []) {

    return quadro;
  }//fim do metodo CamadaEnlaceDadosTransmissoraInsercaoDeBits
  public int[] CamadaDeEnlaceDadosTransmissoraEnquadramentoViolacaoDaCamadaFisica (int quadro []) {

    return quadro;
  }//fim do metodo CamadaEnlaceDadosTransmissoraViolacaoDaCamadaFisica

  public void setControlador (Controlador controlador){
    control = controle;
  }//fim metodo setControlador
}//fim classe CamadaEnlaceDadosTransmissora