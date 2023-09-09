import os

arquivo = 'credit_risk_dataset.csv'

if os.access(arquivo, os.R_OK):
    print("Você possui permissão de leitura para o arquivo.")
else:
    print("Você não possui permissão de leitura para o arquivo.")