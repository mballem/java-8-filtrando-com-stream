# Java 8! Filtrando dados com Stream
___

**Projeto baseado no tutorial:**

- <a href="https://www.mballem.com/post/java-8-filtrando-dados-com-stream/">Java 8! Filtrando dados com Stream</a>.

```
private static void testTwo(List persons) {

    Double total = persons.stream()
            .filter(p -> p.getAge() >= 30)
            .mapToDouble(p -> p.getSalary())
            .sum();

    System.out.printf("Sum of Salaries is %.2f", total);
}
```

### 🛑 Pré-requistos
* Java 8 ou superior

### 🤝 Contribuindo

Desenvolvido e publicado pelo blog **[MBallem - Programando com Java](https://www.mballem.com/)**

Este repositório foi criado para fins de estudo.

Se te ajudei de alguma forma ⭐️ Star o projeto.



