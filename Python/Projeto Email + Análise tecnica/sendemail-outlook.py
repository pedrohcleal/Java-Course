import win32com.client as win32

def send_email(subject, body, to_address):
    outlook = win32.Dispatch('Outlook.Application')
    mail = outlook.CreateItem(0)  # 0 para e-mail comum, 1 para reunião, etc.

    mail.Subject = subject
    mail.Body = body
    mail.To = to_address

    mail.Send()

if __name__ == "__main__":
    subject = "Assunto do e-mail"
    body = "Corpo da mensagem."
    to_address = "destinatario@example.com"

    send_email(subject, body, to_address)
    print("E-mail enviado com sucesso!")