# Trabalho-Pratico-Programacao-Distribuida-Observador-RMI
Programa de Observer RMI entregue no trabalho prático da cadeira de Programação Distribuida


# Equipa 

- [Marco Domingues](https://github.com/Blaldas)
- [Nuno Santos](https://github.com/MidgetSlayer)
- [Miguel Fazenda](https://github.com/D1scak3)


# Background

Este programa é o cliente RMI pertencente à segunda meta do trabalho prático para a cadeira de Progaramação Distribuida.
O programa servidor com o qual deve fazer ligação pode ser encontrado [aqui](https://github.com/Blaldas/Trabalho-Pratico-Programacao-Distribuida-Servidor).


# Caracteristicas

Este cliente RMI obtém o serviço disponibilizado pelo servidor, realizando a troca de dados indicada através de RMI e recebendo também mensagens diretas de outros utilizadores.


# Funcionalidades

- Obtenção do serviço RMI;
- Registo como observador no servidor (não é necessária a criação de conta e não é registado na base de dados);
- Receção de mensagens assincronas;
- Desconecção do servidor (remoção do registo).
