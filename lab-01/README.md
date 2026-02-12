# Sistema de Controle de Versão

## Configuração Inicial para o Uso do Git
### Configuração de nome de usuário e e-mail no Git

**No terminal escrever:** 

O Git registra quem fez cada alteração no código, por isso é importante configurar seu nome de usuário e e-mail.

Sem essas credenciais não é possivel realizar os commits.

**Para configurar, no terminal digite:** 

```bash 
git config --global user.name "nome de usuário"

git config --global user.email "email do github" 
```

### Criando Personal Access Token (PAT) no GitHub
O PAT (Personal Acess Token) é uma alternativa de autenticação da conta sem utilizar a senha do seu usuário, é importante para manter a segurança do seu GitHub. 

**Para criar o PAT, siga os passos:**

>1. Clique na foto do seu perfil do GitHub. Entre em *Settings*.
>2. Na aba da esquerda escolha a ultima opção: *Developer Settings*
>3. Escolha as opções *Personal acess tokens* > *Tokens (classic)*
>4. Na caixinha da direita escolha: *Generate New Token* > *Generate New Token Classic*.
>5. Na página que irá abrir, marcar todas as caixinhas da aba **repo**. Escolher uma data de validade para o Token. No final da página clicar no botão *generate token*.

### Salvar em cache as credenciais do PAT
A cada push feito para o GitHub ele irá exigir seu nome de usuário e seu PAT. Para não ter que inserir a todo momento, é possível salvar por um tempo determinado por você suas ceredenciais em cache. Isso torna o trabalho mais fluido pois não precisamos a todo momento copiar ou gerar um novo TOKEN.

**Para salvar por 1 hora, no terminal criar o comando:**

```bash
git config --global credential.helper 'cache --timeout=3600'
```

## Qual a diferença entre git merge e git rebase?

Tanto o git merge e git rebase integram mudanças de uma branch para outro. 

O comando git merge é a forma que o git possui de unificar branches, ou seja, com ele conseguimos do branch atual puxar o histórico do branch alvo, gerando um commit de unificação.

>**Quando utilizar o git merge**: Para finalizar uma feature branch e incorporá-la à branch principal, ou quando a rastreabilidade do histórico é importante.


O comando git rebase é uma outra forma de se juntar branches, contudo com algumas características mais "radicais". Apesar de manter o histórico de forma linear, ele pega os logs do branch ativo e coloca na frente do branch alvo, além de não gerar o 'commit de merge'.

>**Quando utilizar o git rebase**: Para atualizar sua branch de trabalho local com as novidades da main, mantendo seu histórico linear e sem "merge commits" descenessários.