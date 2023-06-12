package br.com.fag.perinotti.classes.catalogos;

import java.time.LocalDate;
import java.util.ArrayList;

import br.com.fag.perinotti.classes.produtos.Alimento;

public class CatalogoAlimento {
  public static ArrayList<Alimento> catalago() {
    ArrayList<Alimento> catalogoAlimentos = new ArrayList<>();

    catalogoAlimentos.add(new Alimento("Maça", 3.5f, 100, LocalDate.of(2023, 10, 5), null, "AAA", 250f, false, false));
    catalogoAlimentos.add(new Alimento("Banana", 3.5f, 100, LocalDate.of(2023, 10, 5), null, "BBB", 250f, false, false));
    catalogoAlimentos.add(new Alimento("Caixa de Leite 1L", 8f, 25, LocalDate.of(2026, 2, 11), LocalDate.of(2024, 1, 30), "AAA3", null, false, true));
    catalogoAlimentos.add(new Alimento("Pão de Forma", 6f, 12, LocalDate.of(2020, 6, 5), LocalDate.of(2020, 1, 1), "ABCDE", 500f, true, false));

    return catalogoAlimentos;
  }
}
