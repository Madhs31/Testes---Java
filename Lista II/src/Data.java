public class Data {
    // attribute
    private int dia;
    private int mes;
    private int ano;

    // Constructor
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Method for formatting and displaying the date
    public void formatarData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
