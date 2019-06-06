package unichristus.edu.br.alunoonline;

public class ModelA3 {

        private String aluno;
        private String matricula;
        private String  curso;
        private String turno;
        private String atividadeDesenvolvida;
        private String dataDaRealizacao;
        private String local;
        private String instituicao;
        private String pergunta1;
        private String pergunta2;
        private String pergunta3;
        private String pergunta4;
        private char   pergunta5;
        private char   pergunta6;

        public ModelA3(String aluno,
                       String matricula,
                       String curso,
                       String turno,
                       String atividadeDesenvolvida,
                       String dataDaRealizacao,
                       String local,
                       String instituicao,
                       String pergunta1,
                       String pergunta2,
                       String pergunta3,
                       String pergunta4,
                       char pergunta5,
                       char pergunta6)
        {
            this.aluno =  aluno;
            this.matricula = matricula;
            this.curso =  curso;
            this.turno = turno;
            this.atividadeDesenvolvida = atividadeDesenvolvida;
            this.dataDaRealizacao = dataDaRealizacao;
            this.local = local;
            this.instituicao = instituicao;
            this.pergunta1 = pergunta1;
            this.pergunta2 = pergunta2;
            this.pergunta3 = pergunta3;
            this.pergunta4 = pergunta4;
            this.pergunta5 = pergunta5;
            this.pergunta6 =  pergunta6;

        }


    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getAtividadeDesenvolvida() {
        return atividadeDesenvolvida;
    }

    public void setAtividadeDesenvolvida(String atividadeDesenvolvida) {
        this.atividadeDesenvolvida = atividadeDesenvolvida;
    }

    public String getDataDaRealizacao() {
        return dataDaRealizacao;
    }

    public void setDataDaRealizacao(String dataDaRealizacao) {
        this.dataDaRealizacao = dataDaRealizacao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getPergunta1() {
        return pergunta1;
    }

    public void setPergunta1(String pergunta1) {
        this.pergunta1 = pergunta1;
    }

    public String getPergunta2() {
        return pergunta2;
    }

    public void setPergunta2(String pergunta2) {
        this.pergunta2 = pergunta2;
    }

    public String getPergunta3() {
        return pergunta3;
    }

    public void setPergunta3(String pergunta3) {
        this.pergunta3 = pergunta3;
    }

    public String getPergunta4() {
        return pergunta4;
    }

    public void setPergunta4(String pergunta4) {
        this.pergunta4 = pergunta4;
    }

    public char getPergunta5() {
        return pergunta5;
    }

    public void setPergunta5(char pergunta5) {
        this.pergunta5 = pergunta5;
    }

    public char getPergunta6() {
        return pergunta6;
    }

    public void setPergunta6(char pergunta6) {
        this.pergunta6 = pergunta6;
    }
}
