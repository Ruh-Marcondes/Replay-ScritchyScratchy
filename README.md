"# Replay-ScritchyScratchy" 

anotações:
como faz pra descartar as modificações locais e ficar com as do github?
Se você quer descartar todas as alterações locais e deixar seu projeto exatamente como está no GitHub (remoto), você pode fazer isso com alguns comandos do Git.

⚠️ Atenção: isso vai apagar suas mudanças locais sem possibilidade de recuperação (a menos que estejam commitadas em outro lugar).

✅ Opção mais simples (recomendado)
🔄 Voltar o projeto inteiro para o estado do GitHub
git fetch origin
git reset --hard origin/main

Se sua branch for master em vez de main, troque:

git reset --hard origin/master
🧹 Remover também arquivos não rastreados (opcional)

Se quiser deixar o projeto 100% igual ao GitHub, inclusive removendo arquivos novos que você criou:

git clean -fd
-f = força a remoção
-d = inclui pastas
🧪 Comando “tudo em um” (reset completo)
git fetch origin
git reset --hard origin/main
git clean -fd
🔍 Antes de apagar tudo (recomendado checar)

Veja o que vai ser perdido:

git status
💡 Resumo rápido
reset --hard → volta o código para o GitHub
clean -fd → apaga arquivos novos locais
fetch → atualiza referência do GitHub

Se quiser, me fala:

se sua branch é main ou master
ou manda o git remote -v

Que eu te passo o comando exato já pronto pra copiar e colar sem risco 👍
