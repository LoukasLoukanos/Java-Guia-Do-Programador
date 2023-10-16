# ***JAVA – Guia do Programador***

*O objetivo central deste livro é apresentar ao leitor os principais elementos da programação Java, com destaque para os aspectos essenciais da sua sintaxe, de sua aplicação na programação orientada a objetos, além de fundamentos para construção de programas comerciais. Os capítulos estão organizados de maneira que os assuntos principais possam ser facilmente encontrados e estudados. O conteúdo aqui presente é o necessário para as primeiras certificações Java.*

</br>

<details>
<summary>Nota</summary>

### ***Diferenças entre Java EE e Java SE***
A tecnologia Java é amplamente reconhecida como uma linguagem de programação e uma plataforma. A linguagem de programação Java é uma linguagem orientada a objetos de alto nível que possui sua própria sintaxe e estilo característicos. A plataforma Java é um ambiente específico no qual os aplicativos desenvolvidos na linguagem Java são executados.

Existem várias plataformas distintas dentro do universo Java, e muitos desenvolvedores, inclusive aqueles com experiência considerável em Java, podem não compreender completamente as relações entre essas diferentes plataformas.

### As Plataformas Java para Linguagem de Programação
Existem quatro plataformas principais relacionadas à linguagem de programação Java:
 - **Java Platform, Standard Edition (Java SE)**
 - **Java Platform, Enterprise Edition (Java EE)**
 - **Java Platform, Micro Edition (Java ME)**
 - **JavaFX**

**Java SE**</br>
Quando a maioria das pessoas pensa na linguagem de programação Java, provavelmente está pensando na API Java SE. A API do Java SE oferece a funcionalidade central da linguagem de programação Java, abrangendo desde tipos e objetos fundamentais até classes de alto nível utilizadas para desenvolvimento de redes, segurança, acesso a banco de dados, interfaces gráficas de usuário (GUI) e análise XML.

Além da API principal, a plataforma Java SE engloba máquinas virtuais, ferramentas de desenvolvimento, tecnologias de implantação e outras bibliotecas e kits de ferramentas comumente empregados em aplicativos Java.

**Java EE**</br>
A plataforma Java EE é construída sobre a base da plataforma Java SE. Ela disponibiliza uma API e um ambiente de execução para desenvolver e operar aplicativos em rede de grande escala, que são caracterizados por várias camadas, escalabilidade, confiabilidade e segurança.

**Java ME**</br>
A plataforma Java ME fornece uma API e uma máquina virtual de baixo consumo, projetada para executar aplicativos Java em dispositivos pequenos, como telefones celulares. A API do Java ME é um subconjunto da API Java SE, complementada por bibliotecas de classes específicas, úteis para o desenvolvimento de aplicativos em dispositivos de pequeno porte. Em geral, os aplicativos Java ME são clientes de serviços disponibilizados na plataforma Java EE.

**JavaFX**</br>
O JavaFX é uma plataforma voltada para a criação de aplicativos avançados na internet, utilizando uma interface de usuário leve. Os aplicativos JavaFX se beneficiam de recursos gráficos e de mídia acelerados por hardware, proporcionando alto desempenho e uma aparência moderna, além de disponibilizar APIs de alto nível para conexão com fontes de dados diversificadas. Em muitos casos, os aplicativos JavaFX podem funcionar como clientes de serviços oferecidos na plataforma Java EE.

Todas essas plataformas Java consistem em uma Java Virtual Machine (VM) e uma Application Programming Interface (API). A Java Virtual Machine é um programa projetado para uma configuração específica de hardware e software, que executa aplicativos desenvolvidos na tecnologia Java. A API é uma coleção de componentes de software que podem ser utilizados para criar outros componentes de software ou aplicações. Cada plataforma Java disponibiliza sua própria máquina virtual e API, o que possibilita que aplicativos desenvolvidos para uma plataforma específica possam ser executados em qualquer sistema compatível. Isso aproveita todas as vantagens da linguagem de programação Java, tais como independência de plataforma, potência, estabilidade, facilidade de desenvolvimento e segurança.

</details>

</br>

## **Sumário**
### ***➲ Capítulo 1 - Introdução — Pág. 14***
  - | Capítulo| Conteúdo | Pág./code |
    |:-:|:-:|:-:|
    | ➥ 1.1 | A Linguagem Java | Pág. 14 |
    | ➥ 1.2 | Breve histórico | Pág. 14 |
    | ➥ 1.3 | Caracteristicas principais | Pág. 18 |
    | ➥ 1.4 | Ambiente Java | Pág. 20 |
    | ➥ 1.5 | Recursos necessários | Pág. 21 |
    | ➥ 1.6 | Instalando e configurando o Java | Pág. 21 |
    | ➥ 1.7 | Exercícios de revisão | Pág. 22 |

</br>

### ***➲ Capítulo 2 - Sintaxe Java — Pág. 24***
  - | Capítulo| Conteúdo | Pág./code |
    |:-:|:-:|:-:|
    | ➥ 2.1 | Programa minimo | Pág. 24 <a href="#">→code</a> |
    | ➥ 2.2 | Uso de maiúsculas e minúsculas | Pág. 25 <a href="#">→code</a> |
    | ➥ 2.3 | Comentários | Pág. 25 <a href="#">→code</a> |
    | ➥ 2.4 | Compilação e execução | Pág. 26 <a href="#">→code</a> |
    | ➥ 2.5 | Console jshell | Pág. 29 <a href="#">→code</a> |
    | ➥ 2.6 | Tipos de dados primitivos | Pág. 31 <a href="#">→code</a> |
    | ➥ 2.7 | Variáveis | Pág. 36 <a href="#">→code</a> |
    | ➥ 2.8 | Declaração de variáveis | Pág. 38 <a href="#">→code</a> |
    | ➥ 2.9 | Escopo de variáveis | Pág. 39 <a href="#">→code</a> |
    | ➥ 2.10 | Entrada e saída básicas | Pág. 42 <a href="#">→code</a> |
    | ➥ 2.11 | Operadores e expressões | Pág. 46 <a href="#">→code</a> |
    | ➥ 2.12 | Estruturas de controle | Pág. 56 <a href="#">→code</a> |
    | ➥ 2.13 | Estruturas de controle de erros Arranjos e matrizes | Pág. 73 <a href="#">→code</a> |
    | ➥ 2.14 | Argumentos da linha de comando | Pág. 83 <a href="#">→code</a> |
    | ➥ 2.15 | Especificadores e modificadores especiais | Pág. 90 <a href="#">→code</a> |
    | ➥ 2.16 | Anotações | Pág. 93 <a href="#">→code</a> |
    | ➥ 2.17 | Exercícios de revisão | Pág. 95 |

</br>

### ***➲ Capítulo 3 - Orientação a Objetos — Pág. 97***
  - | Capítulo| Conteúdo | Pág./code |
    |:-:|:-:|:-:|
    | ➥ 3.1 | Classes, objetos e instanciação | Pág. 97 <a href="#">→code</a> |
    | ➥ 3.2 | Visibilidade | Pág. 99 <a href="#">→code</a> |
    | ➥ 3.3 | Campos | Pág. 100 <a href="#">→code</a> |
    | ➥ 3.4 | Métodos | Pág. 101 <a href="#">→code</a> |
    | ➥ 3.5 | Métodos de acesso (getters, e setters) | Pág. 111 <a href="#">→code</a> |
    | ➥ 3.6 | Construtores | .Pág. 112 <a href="#">→code</a> |
    | ➥ 3.7 | Representação de classes com UML | Pág. 114 <a href="#">→code</a> |
    | ➥ 3.8 | Sobrecarga de métodos e construtores | Pág. 115 <a href="#">→code</a> |
    | ➥ 3.9 | Membros estáticos | Pág. 117 <a href="#">→code</a> |
    | ➥ 3.10 | Constantes | Pág. 119 <a href="#">→code</a> |
    | ➥ 3.11 | Referência this | Pág. 120 <a href="#">→code</a> |
    | ➥ 3.12 | Finalizadores e coleta de lixo | Pág. 122 <a href="#">→code</a> |
    | ➥ 3.13 | Exceções | Pág. 124 <a href="#">→code</a> |
    | ➥ 3.14 | Criação de pacotes e módulos | Pág. 132 <a href="#">→code</a> |
    | ➥ 3.15 | String, StringBuffer e StringBuilder | Pág. 142 <a href="#">→code</a> |
    | ➥ 3.16 | Exercícios de revisão | Pág. 145 |

</br>

### ***➲ Capítulo 4 - Orientação a Objetos Aplicada — Pág. 147***
  - | Capítulo| Conteúdo | Pág./code |
    |:-:|:-:|:-:|
    | ➥ 4.1 | Herança e sobreposição | Pág. 147 <a href="#">→code</a> |
    | ➥ 4.2 | Classe Object | Pág. 152 <a href="#">→code</a> |
    | ➥ 4.3 | Classes abstratas | Pág. 153 <a href="#">→code</a> |
    | ➥ 4.4 | Interfaces | Pág. 157 <a href="#">→code</a> |
    | ➥ 4.5 | Polimorfismo | Pág. 166 <a href="#">→code</a> |
    | ➥ 4.6 | Classes aninhadas, internas e anónima | Pág. 171 <a href="#">→code</a> |
    | ➥ 4.7 | Classes wrapper | Pág. 176 <a href="#">→code</a> |
    | ➥ 4.8 | Enumerações | Pág. 179 <a href="#">→code</a> |
    | ➥ 4.9 | Genéricos | Pág. 181 <a href="#">→code</a> |
    | ➥ 4.10 | Expressões lambda | Pág. 193 <a href="#">→code</a> |
    | ➥ 4.11 | Referências para método | Pág. 203 <a href="#">→code</a> |
    | ➥ 4.12 | Registro | Pág. 210 <a href="#">→code</a> |
    | ➥ 4.13 | Formatadores | Pág. 214 <a href="#">→code</a> |
    | ➥ 4.14 | Exercícios de revisão | Pág. 218 |

</br>

### ***➲ Capítulo 5 - Construção de aplicativos GUI com Swing — Pág. 219***
  - | Capítulo| Conteúdo | Pág./code |
    |:-:|:-:|:-:|
    | ➥ 5.1 | Componentes | Pág. 219 <a href="#">→code</a> |
    | ➥ 5.2 | Construindo uma aplicação gráfica | Pág. 222 <a href="#">→code</a> |
    | ➥ 5.3 | Gerenciadores de layout | Pág. 228 <a href="#">→code</a> |
    | ➥ 5.4 | Modelo de eventos | Pág. 237 <a href="#">→code</a> |
    | ➥ 5.5 | Eventos típicos do Swing | Pág. 241 <a href="#">→code</a> |
    | ➥ 5.6 | Classes auxiliares | Pág. 244 <a href="#">→code</a> |
    | ➥ 5.7 | Exercícios de revisão | Pág. 245 |

</br>

### ***➲ Capítulo 6 - Aplicação de componentes Swing — Pág. 246***
  - | Capítulo| Conteúdo | Pág./code |
    |:-:|:-:|:-:|
    | ➥ 6.1 | Hierarquia dos componentes Swing | Pág. 246 <a href="#">→code</a> |
    | ➥ 6.2 | Janelas | Pág. 248 <a href="#">→code</a> |
    | ➥ 6.3 | Rótulos de texto | Pág. 253 <a href="#">→code</a> |
    | ➥ 6.4 | Botões | Pág. 256 <a href="#">→code</a> |
    | ➥ 6.5 | Componentes de texto | Pág. 260 <a href="#">→code</a> |
    | ➥ 6.6 | Containers auxiliares | Pág. 266 <a href="#">→code</a> |
    | ➥ 6.7 | Listas | Pág. 273 <a href="#">→code</a> |
    | ➥ 6.8 | Menus | Pág. 280 <a href="#">→code</a> |
    | ➥ 6.9 | Dialogos especializados | Pág. 286 <a href="#">→code</a> |
    | ➥ 6.10 | Outros componentes Swing | Pág. 294 <a href="#">→code</a> |
    | ➥ 6.11 | Modelos do Swing | Pág. 300 <a href="#">→code</a> |
    | ➥ 6.12 | Exercícios de revisão | Pág. 303 |

</br>

### ***➲ Capítulo 7 - Coleções — Pág. 305***
  - | Capítulo| Conteúdo | Pág./code |
    |:-:|:-:|:-:|
    | ➥ 7.1 | Interfaces principais | Pág. 305 <a href="#">→code</a> |
    | ➥ 7.2 | Coleções ordenadas | Pág. 317 <a href="#">→code</a> |
    | ➥ 7.3 | Implementações parciais | Pág. 330 <a href="#">→code</a> |
    | ➥ 7.4 | Implementações concretas | Pág. 337 <a href="#">→code</a> |
    | ➥ 7.5 | Implementações legadas | Pág. 358 <a href="#">→code</a> |
    | ➥ 7.6 | Implementações auxiliares | Pág. 363 <a href="#">→code</a> |
    | ➥ 7.7 | Streams para operações em massa | Pág. 367 <a href="#">→code</a> |
    | ➥ 7.8 | Exercícios de revisão | Pág. 385 |

</br>

### ***➲ Capítulo 8 - Threads — Pág. 387***
  - | Capítulo| Conteúdo | Pág./code |
    |:-:|:-:|:-:|
    | ➥ 8.1 | Definição | Pág. 387 <a href="#">→code</a> |
    | ➥ 8.2 | classe Thread | Pág. 389 <a href="#">→code</a> |
    | ➥ 8.3 | Interface Runnable | Pág. 397 <a href="#">→code</a> |
    | ➥ 8.4 | Ciclo de vida das threads | Pág. 400 <a href="#">→code</a> |
    | ➥ 8.5 | Prioridade das threads | Pág. 401 <a href="#">→code</a> |
    | ➥ 8.6 | Sincronização de threads | Pág. 405 <a href="#">→code</a> |
    | ➥ 8.7 | Grupos de threads | Pág. 412 <a href="#">→code</a> |
    | ➥ 8.8 | Modos de operação | Pág. 417 <a href="#">→code</a> |
    | ➥ 8.9 | Exercícios de revisão | Pág. 419 |

</br>

### ***➲ Capítulo 9 - Streams — Pág. 421***
  - | Capítulo| Conteúdo | Pág./code |
    |:-:|:-:|:-:|
    | ➥ 9.1 | Streams no Java | Pág. 422 <a href="#">→code</a> |
    | ➥ 9.2 | Streams para entrada orientada a bytes | Pág. 423 <a href="#">→code</a> |
    | ➥ 9.3 | Streams para entrada orientada a caracteres | Pág. 429 <a href="#">→code</a> |
    | ➥ 9.4 | Streams para saída orientada a bytes | Pág. 434 <a href="#">→code</a> |
    | ➥ 9.5 | Streams para saída orientada a caracteres | Pág. 439 <a href="#">→code</a> |
    | ➥ 9.6 | Acesso aleatório | Pág. 443 <a href="#">→code</a> |
    | ➥ 9.7 | Informações sobre arquivos e diretórios | Pág. 447 <a href="#">→code</a> |
    | ➥ 9.8 | Serialização de objetos | Pág. 453 <a href="#">→code</a> |
    | ➥ 9.9 | Exercícios de revisão | Pág. 458 |

</br>

### ***➲ Capítulo 10 - JDBC — Pág. 460***
  - | Capítulo| Conteúdo | Pág./code |
    |:-:|:-:|:-:|
    | ➥ 10.1 | Arquitetura | Pág. 460 <a href="#">→code</a> |
    | ➥ 10.2 | SQL uma introdução | Pág. 464 <a href="#">→code</a> |
    | ➥ 10.3 | Classe DriverManager e URLs JDBC | Pág. 470 <a href="#">→code</a> |
    | ➥ 10.4 | Conexão com banco de dados no JDBC | Pág. 473 <a href="#">→code</a> |
    | ➥ 10.5 | Operação interativa | Pág. 477 <a href="#">→code</a> |
    | ➥ 10.6 | Operação em lote | Pág. 489 <a href="#">→code</a> |
    | ➥ 10.7 | Operação preparada | Pág. 491 <a href="#">→code</a> |
    | ➥ 10.8 | Acionamento de funções e procedimentos armazenados | Pág. 494 <a href="#">→code</a> |
    | ➥ 10.9 | Apresentação de dados em tabelas | Pág. 500 <a href="#">→code</a> |
    | ➥ 10.10|- Exercícios de revisão | Pág. 511 |

</br>

### ***➲ Apêndice A - Eclipse — Pág. 513***
  - | Capítulo| Conteúdo | Pág./code |
    |:-:|:-:|:-:|
    | ➥ A.1 | Instalação | Pág. 513 | 
    | ➥ A.2 | Organização | Pág. 514 |
    | ➥ A.3 | Iniciando o Eclipse | Pág. 514 |
    | ➥ A.4 | Seleção de perspectiva | Pág. 516 |
    | ➥ A.5 | Criação de projetos Java | Pág. 516 |
    | ➥ A.6 | Criação de pacotes e classes | Pág. 518 |
    | ➥ A.7 | Edição de código | Pág. 519 |
    | ➥ A.8 | Execução de programas | Pág. 520 |
    | ➥ A.9 | Geração automática de código | Pág. 524 |

</br>

### ***➲ Apêndice B - Apache Derby — Pág. 527***
  - | Capítulo| Conteúdo | Pág./code |
    |:-:|:-:|:-:|
    | ➥ B.1 | Instalação | Pág. 527 |
    | ➥ B.2 | Modos de operação | Pág. 528 |
    | ➥ B.3 | Conexão | Pág. 528 |
    | ➥ B.4 | Criação de bancos de dados | Pág. 529 |
    | ➥ B.5 | Criação de bancos de dados de teste | Pág. 530 |
