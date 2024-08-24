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
        System.out.println("3. Try to recover your account using an online tool");
        int choice = getUserChoice(3);

        if (choice == 1) {
            contactBank();
        } else if (choice == 2) {
            reportPhishing();
        } else if (choice == 3) {
            recoverAccount();
        }
    }

    private static void recoverAccount() {
        System.out.println("You use an online recovery tool to attempt to secure your account. It's a lengthy process, but eventually, you manage to regain control.");
        System.out.println("1. Change your passwords immediately");
        System.out.println("2. Monitor your accounts for suspicious activity");
        int choice = getUserChoice(2);

        if (choice == 1) {
            changePasswords();
        } else if (choice == 2) {
            monitorAccounts();
        }
    }

    private static void monitorAccounts() {
        System.out.println("You monitor your accounts and find no unusual activity. It seems the phishing attempt was unsuccessful in causing any immediate harm.");
        endStory();
    }

    private static void runSecurityScan() {
        System.out.println("The security scan finds no issues, but you decide to change your passwords as a precaution.");
        System.out.println("1. Change your passwords");
        System.out.println("2. Continue using your computer");
        int choice = getUserChoice(2);

        if (choice == 1) {
            changePasswords();
        } else if (choice == 2) {
            continueBrowsing();
        }
    }

    private static void onlineShopping() {
        System.out.println("On the shopping site, you find an amazing deal on a gadget.");
        System.out.println("1. Purchase the gadget");
        System.out.println("2. Add it to your wishlist");
        System.out.println("3. Read reviews about the gadget");
        int choice = getUserChoice(3);

        if (choice == 1) {
            purchaseGadget();
        } else if (choice == 2) {
            addToWishlist();
        } else if (choice == 3) {
            readReviews();
        }
    }

    private static void readReviews() {
        System.out.println("You read reviews about the gadget and find mixed opinions. Some people love it, while others have had issues.");
        System.out.println("1. Purchase the gadget despite the reviews");
        System.out.println("2. Decide not to buy the gadget");
        int choice = getUserChoice(2);

        if (choice == 1) {
            purchaseGadget();
        } else if (choice == 2) {
            endStory();
        }
    }

    private static void newsWebsite() {
        System.out.println("You read some breaking news about a major event.");
        System.out.println("1. Share the news on social media");
        System.out.println("2. Search for more details about the event");
        System.out.println("3. Discuss the news with a friend");
        int choice = getUserChoice(3);

        if (choice == 1) {
            shareArticle();
        } else if (choice == 2) {
            continueBrowsing();
        } else if (choice == 3) {
            discussNews();
        }
    }

    private static void discussNews() {
        System.out.println("You call a friend and discuss the news. It turns out they have additional insights and opinions about the event.");
        System.out.println("1. Invite them to discuss further in person");
        System.out.println("2. Continue the discussion online");
        int choice = getUserChoice(2);

        if (choice == 1) {
            inviteHangout();
        } else if (choice == 2) {
            continueChatting();
        }
    }

    private static void viewPhoto() {
        System.out.println("You view the photo and see that it’s a funny picture from your friend's recent vacation.");
        System.out.println("1. Comment on the photo");
        System.out.println("2. Share the photo");
        System.out.println("3. Like the photo and move on");
        int choice = getUserChoice(3);

        if (choice == 1) {
            commentPhoto();
        } else if (choice == 2) {
            sharePhoto();
        } else if (choice == 3) {
            likePhoto();
        }
    }

    private static void likePhoto() {
        System.out.println("You like the photo, and your friend notices your support.");
        endStory();
    }

    private static void messageFriend() {
        System.out.println("You message your friend and catch up on recent events.");
        System.out.println("1. Invite them to hang out");
        System.out.println("2. Continue chatting online");
        System.out.println("3. Ask about the photo in more detail");
        int choice = getUserChoice(3);

        if (choice == 1) {
            inviteHangout();
        } else if (choice == 2) {
            continueChatting();
        } else if (choice == 3) {
            askAboutPhoto();
        }
    }

    private static void askAboutPhoto() {
        System.out.println("You ask your friend more about the photo, and they share some funny stories from their vacation.");
        endStory();
    }

    private static void readArticle() {
        System.out.println("The article gives you great tips on how to stay safe online.");
        System.out.println("1. Follow the tips and secure your accounts");
        System.out.println("2. Bookmark the blog for future reference");
        System.out.println("3. Share the article with friends");
        int choice = getUserChoice(3);

        if (choice == 1) {
            secureAccounts();
        } else if (choice == 2) {
            bookmarkBlog();
        } else if (choice == 3) {
            shareArticle();
        }
    }

    private static void shareArticle() {
        System.out.println("You share the article with your friends, helping them stay informed about online safety.");
        endStory();
    }

    private static void secureAccounts() {
        System.out.println("You follow the tips and secure your accounts. You feel more confident about your online safety.");
        endStory();
    }

    private static void continueBrowsing() {
        System.out.println("You continue browsing and find some interesting websites.");
        endStory();
    }

    private static void purchaseGadget() {
        System.out.println("You make the purchase. It arrives in a few days and you’re excited to try it out.");
        endStory();
    }

    private static void addToWishlist() {
        System.out.println("You add the gadget to your wishlist and continue browsing other items.");
        endStory();
    }

    private static void commentPhoto() {
        System.out.println("You leave a comment on the photo, and your friend thanks you for it.");
        endStory();
    }

    private static void sharePhoto() {
        System.out.println("You share the photo with others, and your friend appreciates the gesture.");
        endStory();
    }

    private static void inviteHangout() {
        System.out.println("You invite your friend to hang out and they agree. You have a great time together.");
        endStory();
    }

    private static void continueChatting() {
        System.out.println("You continue chatting with your friend online. The conversation is enjoyable.");
        endStory();
    }

    private static void contactBank() {
        System.out.println("You contact your bank and take steps to secure your accounts. They advise you to monitor your accounts closely.");
        endStory();
    }

    private static void reportPhishing() {
        System.out.println("You report the phishing attempt to the authorities. They thank you for your vigilance.");
        endStory();
    }

    private static void changePasswords() {
        System.out.println("You change your passwords and feel more secure about your accounts.");
        endStory();
    }

    private static void bookmarkBlog() {
        System.out.println("You bookmark the blog for future reference, ensuring you have access to more online safety tips.");
        endStory();
    }

    private static void endStory() {
        System.out.println("The story ends here. Thank you for playing!");
        System.exit(0);
    }

    private static int getUserChoice(int numOptions) {
        int choice = -1;
        while (choice < 1 || choice > numOptions) {
            System.out.print("Enter your choice (1-" + numOptions + "): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                if (choice < 1 || choice > numOptions) {
                    System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Consume invalid input
            }
        }
        return choice;
    }
}
