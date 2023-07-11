package chl.ancud.m5_individual7;

public class Presentador {
    private Modelo modelo;
    private IViewPresenter vistaPresentador;

    public Presentador(IViewPresenter vistaPresentador) {
        this.vistaPresentador = vistaPresentador;

        modelo = new Modelo();
    }

    public void evaluaClave(String clave) {
        int fuerzaClave = modelo.validarClave(clave);

        switch (fuerzaClave) {
            case Modelo.DEBIL:
                this.vistaPresentador.mostrarDebil();
                break;
            case Modelo.MEDIA:
                this.vistaPresentador.mostrarMedia();
                break;
            case Modelo.FUERTE:
                this.vistaPresentador.mostrarFuerte();
                break;
            default:
                this.vistaPresentador.mostrarError();
                break;
        }

    }

}
