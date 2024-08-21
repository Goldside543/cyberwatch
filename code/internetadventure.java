import java.util.Scanner;

public class internetadventure {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        startStory();
    }

    private static void startStory() {
        System.out.println("You log into your computer and see a mysterious email in your inbox.");
        System.out.println("1. Open the email");
        System.out.println("2. Delete the email");
        int choice = getUserChoice(2);

        if (choice == 1) {
            openEmail();
        } else if (choice == 2) {
            deleteEmail();
        }
    }

    private static void openEmail() {
        System.out.println("The email is from an unknown sender with a subject: 'You've Won a Prize!'");
        System.out.println("1. Click the link in the email");
        System.out.println("2. Mark the email as spam");
        int choice = getUserChoice(2);

        if (choice == 1) {
            clickLink();
        } else if (choice == 2) {
            markSpam();
        }
    }

    private static void deleteEmail() {
        System.out.println("You delete the email and notice a new notification on your social media account.");
        System.out.println("1. Check the notification");
        System.out.println("2. Ignore the notification and browse the web");
        int choice = getUserChoice(2);

        if (choice == 1) {
            checkNotification();
        } else if (choice == 2) {
            browseWeb();
        }
    }

    private static void clickLink() {
        System.out.println("The link takes you to a suspicious website asking for your personal information.");
        System.out.println("1. Enter your information");
        System.out.println("2. Close the website and run a security scan");
        int choice = getUserChoice(2);

        if (choice == 1) {
            enterInfo();
        } else if (choice == 2) {
            runSecurityScan();
        }
    }

    private static void markSpam() {
        System.out.println("You mark the email as spam and continue to browse the web.");
        System.out.println("1. Visit an online shopping site");
        System.out.println("2. Visit a news website");
        int choice = getUserChoice(2);

        if (choice == 1) {
            onlineShopping();
        } else if (choice == 2) {
            newsWebsite();
        }
    }

    private static void checkNotification() {
        System.out.println("The notification is from a friend who tagged you in a photo.");
        System.out.println("1. View the photo");
        System.out.println("2. Message your friend");
        int choice = getUserChoice(2);

        if (choice == 1) {
            viewPhoto();
        } else if (choice == 2) {
            messageFriend();
        }
    }

    private static void browseWeb() {
        System.out.println("While browsing, you stumble upon a cybersecurity blog with interesting articles.");
        System.out.println("1. Read an article about online safety");
        System.out.println("2. Exit the blog and continue browsing");
        int choice = getUserChoice(2);

        if (choice == 1) {
            readArticle();
        } else if (choice == 2) {
            continueBrowsing();
        }
    }

    private static void enterInfo() {
        System.out.println("You entered your information. Unfortunately, it turns out to be a phishing scam.");
        System.out.println("1. Contact your bank");
        System.out.println("2. Report the phishing attempt to authorities");
        int choice = getUserChoice(2);

        if (choice == 1) {
            contactBank();
        } else if (choice == 2) {
            reportPhishing();
        }
    }

    private static void runSecurityScan() {
        System.out.println("The security scan finds no issues, but you decide to change your passwords as a precaution.");
        System.out.println("1. Change your passwords");
        System.out.println("2. Continue using your computer");
        int choice = getUserChoice(2);

        if (choice == 1) {
            changePasswords();
        } else if (choice == 2) {
            continueUsingComputer();
        }
    }

    private static void onlineShopping() {
        System.out.println("On the shopping site, you find an amazing deal on a gadget.");
        System.out.println("1. Purchase the gadget");
        System.out.println("2. Add it to your wishlist");
        int choice = getUserChoice(2);

        if (choice == 1) {
            purchaseGadget();
        } else if (choice == 2) {
            addToWishlist();
        }
    }

    private static void newsWebsite() {
        System.out.println("You read some breaking news about a major event.");
        System.out.println("1. Share the news on social media");
        System.out.println("2. Search for more details about the event");
        int choice = getUserChoice(2);

        if (choice == 1) {
            shareNews();
        } else if (choice == 2) {
            searchDetails();
        }
    }

    private static void viewPhoto() {
        System.out.println("You view the photo and see that it’s a funny picture from your friend's recent vacation.");
        System.out.println("1. Comment on the photo");
        System.out.println("2. Share the photo");
        int choice = getUserChoice(2);

        if (choice == 1) {
            commentPhoto();
        } else if (choice == 2) {
            sharePhoto();
        }
    }

    private static void messageFriend() {
        System.out.println("You message your friend and catch up on recent events.");
        System.out.println("1. Invite them to hang out");
        System.out.println("2. Continue chatting online");
        int choice = getUserChoice(2);

        if (choice == 1) {
            inviteHangout();
        } else if (choice == 2) {
            continueChatting();
        }
    }

    private static void readArticle() {
        System.out.println("The article gives you great tips on how to stay safe online.");
        System.out.println("1. Follow the tips and secure your accounts");
        System.out.println("2. Bookmark the blog for future reference");
        int choice = getUserChoice(2);

        if (choice == 1) {
            secureAccounts();
        } else if (choice == 2) {
            bookmarkBlog();
        }
    }

    private static void continueBrowsing() {
        System.out.println("You continue browsing and find some interesting websites.");
        System.out.println("1. Explore a tech forum");
        System.out.println("2. Visit a streaming service");
        int choice = getUserChoice(2);

        if (choice == 1) {
            techForum();
        } else if (choice == 2) {
            streamingService();
        }
    }

    private static void contactBank() {
        System.out.println("You contact your bank and secure your accounts. They advise you to monitor for any unusual activity.");
        endStory();
    }

    private static void reportPhishing() {
        System.out.println("You report the phishing attempt to the authorities. They thank you for your vigilance.");
        endStory();
    }

    private static void changePasswords() {
        System.out.println("You change your passwords and feel more secure. Make sure to use strong, unique passwords.");
        endStory();
    }

    private static void continueUsingComputer() {
        System.out.println("You continue using your computer, but stay alert for any suspicious activity.");
        endStory();
    }

    private static void purchaseGadget() {
        System.out.println("You make the purchase and eagerly await the arrival of your new gadget.");
        endStory();
    }

    private static void addToWishlist() {
        System.out.println("You add the gadget to your wishlist and decide to think about it before buying.");
        endStory();
    }

    private static void shareNews() {
        System.out.println("You share the news on social media and engage in discussions with friends.");
        endStory();
    }

    private static void searchDetails() {
        System.out.println("You search for more details and find interesting updates about the event.");
        endStory();
    }

    private static void commentPhoto() {
        System.out.println("You comment on the photo and your friend appreciates it.");
        endStory();
    }

    private static void sharePhoto() {
        System.out.println("You share the photo and it gets a lot of likes from your friends.");
        endStory();
    }

    private static void inviteHangout() {
        System.out.println("You invite your friend to hang out and plan a fun outing together.");
        endStory();
    }

    private static void continueChatting() {
        System.out.println("You continue chatting with your friend and have a great time catching up.");
        endStory();
    }

    private static void secureAccounts() {
        System.out.println("You follow the tips and secure your accounts, feeling much safer online.");
        endStory();
    }

    private static void bookmarkBlog() {
        System.out.println("You bookmark the blog and plan to revisit it for more useful information.");
        endStory();
    }

    private static void techForum() {
        System.out.println("You explore the tech forum and join interesting discussions about new technologies.");
        endStory();
    }

    private static void streamingService() {
        System.out.println("You visit a streaming service and watch some of your favorite shows.");
        endStory();
    }

    private static void endStory() {
        System.out.println("The story ends here. Thank you for playing!");
    }

    private static int getUserChoice(int numberOfChoices) {
        int choice = 0;
        while (choice < 1 || choice > numberOfChoices) {
            System.out.print("Enter your choice (1-" + numberOfChoices + "): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                scanner.next(); // clear invalid input
            }
        }
        return choice;
    }
}
