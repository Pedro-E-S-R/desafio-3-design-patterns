package Builder;

import Builder.pessoa.PessoaBuilderRotina;
import Builder.pessoa.PessoaRotina;
import Builder.pessoa.PessoalFeito;

public class Demo {
    public static void main(String[] args) {
        DiaPessoa diaPessoa = new DiaPessoa();
        PessoaBuilderRotina pbr = new PessoaBuilderRotina();
        diaPessoa.pessoaDeManha(pbr);

        PessoaRotina teste = pbr.getPessoa();
        System.out.println("Teste alimeto: "+ teste.getAlimento().getProteina());

        System.out.println("--------------------------------");

        PessoalFeito pf = pbr.getPessoaFeito();
        System.out.println(pf.print());


    }
}