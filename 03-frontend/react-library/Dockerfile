# Use an official Node.js runtime as base
FROM node:20-alpine

# Set working directory
WORKDIR /app

# Copy package.json and package-lock.json first (better for caching)
COPY package*.json ./

# Install dependencies
RUN npm install

# Copying the rest of the project files
COPY src ./src

COPY public ./public

COPY tsconfig.json ./

# Expose the React development server port
EXPOSE 3000

# Start the React app
CMD ["npm", "start"]


