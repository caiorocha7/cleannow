# Navigate to the Electron binary directory
cd ./node_modules/electron/dist

# Change the owner of the chrome-sandbox file to root
sudo chown root chrome-sandbox

# Set the setuid bit and permissions to 4755
sudo chmod 4755 chrome-sandbox