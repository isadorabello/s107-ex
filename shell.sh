ls
echo "Pipeline Test"
sudo apt install mailutils
echo "installation complete"
echo "Sending email with linux mal" | mail -s "Pipeline executed" $email