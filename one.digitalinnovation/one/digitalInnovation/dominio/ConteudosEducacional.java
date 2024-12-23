package one.digitalInnovation.dominio;

public abstract class ConteudosEducacional {

    private String titulo;
    private String descricao;

    protected final double XP_PADRAO = 10.0;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
