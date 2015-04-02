package cinema.dominio;

public class Sessao {

    public Sala sala;
    public Filme filme;
    public int capacidade;
    public String horario;
    public boolean isFull;

    public Sessao(Sala sala, Filme filme, int capacidade, String horario, boolean isFull) {
        this.sala = sala;
        this.filme = filme;
        this.capacidade = capacidade;
        this.horario = horario;
        this.isFull = isFull;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public boolean isIsFull() {
        return isFull;
    }

    public void setIsFull(boolean isFull) {
        this.isFull = isFull;
    }
}