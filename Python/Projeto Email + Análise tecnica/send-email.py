import smtplib
from email.mime.text import MIMEText
from email.mime.multipart import MIMEMultipart

def send_email(subject, body, to_address):
    from_address = "seu_email@example.com"
    password = "sua_senha"

    msg = MIMEMultipart()
    msg['From'] = from_address
    msg['To'] = to_address
    msg['Subject'] = subject

    msg.attach(MIMEText(body, 'plain'))

    server = smtplib.SMTP('smtp.example.com', 587)  # Substitua pelos detalhes do seu servidor SMTP
    server.starttls()
    server.login(from_address, password)
    server.sendmail(from_address, to_address, msg.as_string())
    server.quit()

if __name__ == "__main__":
    subject = "Assunto do e-mail"
    body = "Corpo da mensagem."
    to_address = "destinatario@example.com"

    send_email(subject, body, to_address)
    print("E-mail enviado com sucesso!")
