import java.util.Objects;

public class uers extends A{
    private String zhangHao;
    private String miMa;

    public uers() {
    }

    public uers(String zhangHao, String miMa) {
        this.zhangHao = zhangHao;
        this.miMa = miMa;
    }

    public String getZhangHao() {
        return zhangHao;
    }

    public void setZhangHao(String zhangHao) {
        this.zhangHao = zhangHao;
    }

    public String getMiMa() {
        return miMa;
    }

    public void setMiMa(String miMa) {
        this.miMa = miMa;
    }
    public void dosome (){
        System.out.println("ab");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        uers uers = (uers) o;
        return Objects.equals(zhangHao, uers.zhangHao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zhangHao);
    }
}
