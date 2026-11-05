# Dreitec — Central Comercial

Interface de apresentação para acompanhamento de solicitações, orçamentos e retornos da Dreitec.

## Abrir o projeto

Abra `index.html` diretamente no navegador. Não é necessário instalar dependências.

## Funcionalidades da versão demonstrativa

- Painel geral com indicadores de solicitações, propostas e retornos.
- Cadastro de solicitações e registro de medidas, origem e serviço.
- Consulta e atualização do andamento comercial de cada proposta.
- Filtros por etapa e serviço e pesquisa por contato.
- Agenda de retornos e registro de observações.
- Armazenamento local no navegador, para testar o fluxo sem servidor.

**Observação:** Os registros iniciais são ilustrativos. Esta interface não integra WhatsApp, Instagram, banco de dados ou sistemas externos. Não deve receber dados reais de clientes enquanto não for adaptada para uso em produção.

## Publicação no GitHub Pages

1. Crie um repositório no GitHub e envie os arquivos `index.html`, `.nojekyll` e `README.md` para a raiz.
2. Em **Settings → Pages**, selecione **Deploy from a branch**.
3. Escolha a branch `main`, a pasta `/ (root)` e salve.
4. O GitHub mostrará o endereço publicado após a implantação.

## Uso e manutenção

Projeto de demonstração comercial da CTK Sistemas. Para transformar em sistema de uso real, será necessário implementar autenticação, banco de dados, controle de acesso, armazenamento de anexos e integrações.