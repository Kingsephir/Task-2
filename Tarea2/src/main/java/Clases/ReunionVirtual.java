package Clases;

public class ReunionVirtual {
    private String enlace;
    public ReunionVirtual(Invitacion invitacion, String enlace){
        super(invitacion);
        this.enlace = enlace;
    }

    public String getEnlace(){
        return enlace;
    }

    @Override
    public void iniciar() {
        setHoraInicio(Instant.now());
    }

    @Override
    public void finalizar() {
        setHoraFinal(Instant.now());
    }
}
