package ro.sda.dealership.presentation;

import ro.sda.dealership.model.Client;

import java.util.List;

public class ClientWriter implements ConsoleWriter<Client> {
    public void write(Client value) {
        System.out.println("Id: " + value.getId());
        System.out.println("Name: " + value.getName());
        System.out.println("Address: " + value.getAddress());
    }

    public void writeAll(List<Client> clients) {
        if (clients.size() == 0) {
            System.out.println("No clients available.");
        } else {
            System.out.println("Client list: ");
            for (Client client : clients) {
                writeSummary(client);
            }
        }
    }

    private void writeSummary(Client client) {
        System.out.print("Id: " + client.getId());
        System.out.print("  Name: " + client.getName());
        System.out.println("  Address: " + client.getAddress());
    }

}
