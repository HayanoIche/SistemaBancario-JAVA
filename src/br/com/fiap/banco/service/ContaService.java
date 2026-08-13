package br.com.fiap.banco.service;

import br.com.fiap.banco.model.Cliente;
import br.com.fiap.banco.model.Conta;
import br.com.fiap.banco.model.ContaCorrente;
import br.com.fiap.banco.model.ContaPoupanca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContaService
{
    // Gambiarrinha
    private static long serialId = 1;
    private static long serialNumeroConta = 10000;

    // Banco de dados exemplo
    private List<Conta> contas = new ArrayList<>();

    // Abertura de conta
    public Conta aberturaConta(String tipo, Cliente cliente)
    {
        Conta retorno = null;

        LocalDate hoje = LocalDate.now();
        long idConta = serialId++;
        long numeroConta = serialNumeroConta++;

        if (tipo.equals("Poupanca"))
        {
            retorno = new ContaPoupanca(idConta, Long.toString(numeroConta), 0.0, hoje, cliente);
        }
        else
        {
            retorno = new ContaCorrente(idConta, Long.toString(numeroConta), 0.0, hoje, cliente);
        }

        contas.add(retorno);
        return retorno;
    }

    // Transferencia

}
