import java.util.ArrayList;
import java.util.Scanner;


class Task {
    private String title;
    private boolean completed;




    public Task(String title) {
        this.title = title;
        this.completed = false;
    }

    public void markAsCompleted() {
        this.completed = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        return (completed ? "[X] " : "[ ] ") + title;

    }
}

public class TaskManager {
    private static final ArrayList<Task> tasks = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nGerenciador de Tarefas");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Marcar Tarefa como Concluída");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (option) {
                case 1:
                    addTask();
                    break;
                case 2:
                    listTasks();
                    break;
                case 3:
                    completeTask();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void addTask() {
        System.out.print("Digite o nome da tarefa: ");
        String title = scanner.nextLine();
        tasks.add(new Task(title));
        System.out.println("Tarefa adicionada com sucesso!");
    }

    private static void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }
        System.out.println("\nListas de Tarefas:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    private static void completeTask() {
        listTasks();
        if (tasks.isEmpty()) return;
        System.out.print("Digite o número da tarefa a marcar como concluída: ");
        int index = scanner.nextInt() - 1;
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markAsCompleted();
            System.out.println("Tarefa concluída!");
        } else {
            System.out.println("Número inválido.");
        }
    }
}