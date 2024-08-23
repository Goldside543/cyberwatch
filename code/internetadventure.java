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
        System.out.println("1. Monitor accounts for suspicious activity");
        System.out.println("2. Set up alerts for unusual transactions");
        int choice = getUserChoice(2);

        if (choice == 1) {
            monitorAccounts();
        } else if (choice == 2) {
            setupAlerts();
        }
    }

    private static void reportPhishing() {
        System.out.println("You report the phishing attempt to the authorities. They thank you for your vigilance.");
        System.out.println("1. Stay informed about new phishing tactics");
        System.out.println("2. Share your experience on a tech forum");
        int choice = getUserChoice(2);

        if (choice == 1) {
            stayInformed();
        } else if (choice == 2) {
            shareExperience();
        }
    }

    private static void changePasswords() {
        System.out.println("You change your passwords and feel more secure. Make sure to use strong, unique passwords.");
        System.out.println("1. Enable two-factor authentication");
        System.out.println("2. Update your security questions");
        int choice = getUserChoice(2);

        if (choice == 1) {
            enableTwoFactor();
        } else if (choice == 2) {
            updateSecurityQuestions();
        }
    }

    private static void continueUsingComputer() {
        System.out.println("You continue using your computer, but stay alert for any suspicious activity.");
        System.out.println("1. Install a new antivirus program");
        System.out.println("2. Backup your data");
        int choice = getUserChoice(2);

        if (choice == 1) {
            installAntivirus();
        } else if (choice == 2) {
            backupData();
        }
    }

    private static void purchaseGadget() {
        System.out.println("You make the purchase and eagerly await the arrival of your new gadget.");
        System.out.println("1. Track your order online");
        System.out.println("2. Share the deal with your friends");
        int choice = getUserChoice(2);

        if (choice == 1) {
            trackOrder();
        } else if (choice == 2) {
            shareDeal();
        }
    }

    private static void addToWishlist() {
        System.out.println("You add the gadget to your wishlist and decide to think about it before buying.");
        System.out.println("1. Compare prices on other websites");
        System.out.println("2. Read reviews of the gadget");
        int choice = getUserChoice(2);

        if (choice == 1) {
            comparePrices();
        } else if (choice == 2) {
            readReviews();
        }
    }

    private static void shareNews() {
        System.out.println("You share the news on social media and get into a discussion with your followers.");
        System.out.println("1. Engage in the discussion");
        System.out.println("2. Leave the discussion and continue browsing");
        int choice = getUserChoice(2);

        if (choice == 1) {
            engageDiscussion();
        } else if (choice == 2) {
            leaveDiscussion();
        }
    }

    private static void searchDetails() {
        System.out.println("You search for more details and find different perspectives on the event.");
        System.out.println("1. Share the new information");
        System.out.println("2. Bookmark the sources for later");
        int choice = getUserChoice(2);

        if (choice == 1) {
            shareInformation();
        } else if (choice == 2) {
            bookmarkSources();
        }
    }

    private static void commentPhoto() {
        System.out.println("You comment on the photo with a funny caption, making your friend laugh.");
        System.out.println("1. Like the photo");
        System.out.println("2. Share the photo with others");
        int choice = getUserChoice(2);

        if (choice == 1) {
            likePhoto();
        } else if (choice == 2) {
            sharePhotoAgain();
        }
    }

    private static void sharePhoto() {
        System.out.println("You share the photo, and it quickly becomes popular among your friends.");
        System.out.println("1. Create a meme using the photo");
        System.out.println("2. Start a photo-sharing thread");
        int choice = getUserChoice(2);

        if (choice == 1) {
            createMeme();
        } else if (choice == 2) {
            startThread();
        }
    }

    private static void inviteHangout() {
        System.out.println("You invite your friend to hang out, and they agree. You have a great time together.");
        System.out.println("1. Take photos during the hangout");
        System.out.println("2. Share your experience on social media");
        int choice = getUserChoice(2);

        if (choice == 1) {
            takePhotos();
        } else if (choice == 2) {
            shareExperienceOnline();
        }
    }

    private static void continueChatting() {
        System.out.println("You continue chatting and catch up on each other's lives. It’s a fun conversation.");
        System.out.println("1. Share a funny video");
        System.out.println("2. Plan a future meetup");
        int choice = getUserChoice(2);

        if (choice == 1) {
            shareVideo();
        } else if (choice == 2) {
            planMeetup();
        }
    }

    private static void secureAccounts() {
        System.out.println("You follow the tips and secure your accounts. You feel much safer now.");
        System.out.println("1. Set up a password manager");
        System.out.println("2. Enable account activity notifications");
        int choice = getUserChoice(2);

        if (choice == 1) {
            setupPasswordManager();
        } else if (choice == 2) {
            enableNotifications();
        }
    }

    private static void bookmarkBlog() {
        System.out.println("You bookmark the blog for future reference. It seems like a great resource.");
        System.out.println("1. Subscribe to the blog's newsletter");
        System.out.println("2. Share the blog with your friends");
        int choice = getUserChoice(2);

        if (choice == 1) {
            subscribeNewsletter();
        } else if (choice == 2) {
            shareBlog();
        }
    }

    private static void techForum() {
        System.out.println("On the tech forum, you find discussions on various topics that interest you.");
        System.out.println("1. Join a discussion on cybersecurity");
        System.out.println("2. Start a new thread about a tech issue you're facing");
        int choice = getUserChoice(2);

        if (choice == 1) {
            joinDiscussion();
        } else if (choice == 2) {
            startTechThread();
        }
    }

    private static void streamingService() {
        System.out.println("You watch a movie on the streaming service. It's a relaxing way to end the day.");
        System.out.println("1. Rate the movie");
        System.out.println("2. Share your thoughts about the movie on social media");
        int choice = getUserChoice(2);

        if (choice == 1) {
            rateMovie();
        } else if (choice == 2) {
            shareThoughts();
        }
    }

    private static void monitorAccounts() {
        System.out.println("You keep a close eye on your accounts, ready to act if you see anything suspicious.");
        System.out.println("1. Set up account alerts");
        System.out.println("2. Report any unusual activity immediately");
        int choice = getUserChoice(2);

        if (choice == 1) {
            setupAccountAlerts();
        } else if (choice == 2) {
            reportActivity();
        }
    }

    private static void setupAlerts() {
        System.out.println("You set up alerts for any unusual transactions, giving you peace of mind.");
        System.out.println("1. Review your recent transactions");
        System.out.println("2. Contact customer support to discuss further security measures");
        int choice = getUserChoice(2);

        if (choice == 1) {
            reviewTransactions();
        } else if (choice == 2) {
            contactSupport();
        }
    }

    private static void stayInformed() {
        System.out.println("You stay informed about new phishing tactics, helping you avoid future scams.");
        System.out.println("1. Share the information with others");
        System.out.println("2. Subscribe to a cybersecurity newsletter");
        int choice = getUserChoice(2);

        if (choice == 1) {
            shareInfoWithOthers();
        } else if (choice == 2) {
            subscribeToCybersecurityNewsletter();
        }
    }

    private static void shareExperience() {
        System.out.println("You share your experience on a tech forum, helping others stay vigilant against phishing.");
        System.out.println("1. Participate in other discussions on the forum");
        System.out.println("2. Start your own blog about cybersecurity");
        int choice = getUserChoice(2);

        if (choice == 1) {
            participateInDiscussions();
        } else if (choice == 2) {
            startBlog();
        }
    }

    private static void enableTwoFactor() {
        System.out.println("You enable two-factor authentication, adding an extra layer of security to your accounts.");
        System.out.println("1. Learn more about two-factor authentication");
        System.out.println("2. Share a guide on how to enable it with your friends");
        int choice = getUserChoice(2);

        if (choice == 1) {
            learnAboutTwoFactor();
        } else if (choice == 2) {
            shareGuide();
        }
    }

    private static void updateSecurityQuestions() {
        System.out.println("You update your security questions, making sure they're not easily guessable.");
        System.out.println("1. Review all your account settings");
        System.out.println("2. Add recovery options to your accounts");
        int choice = getUserChoice(2);

        if (choice == 1) {
            reviewAccountSettings();
        } else if (choice == 2) {
            addRecoveryOptions();
        }
    }

    private static void installAntivirus() {
        System.out.println("You install a new antivirus program, protecting your computer from potential threats.");
        System.out.println("1. Run a full system scan");
        System.out.println("2. Update the antivirus definitions regularly");
        int choice = getUserChoice(2);

        if (choice == 1) {
            runFullScan();
        } else if (choice == 2) {
            updateAntivirusDefinitions();
        }
    }

    private static void backupData() {
        System.out.println("You backup your data, ensuring that your important files are safe.");
        System.out.println("1. Set up automatic backups");
        System.out.println("2. Store your backups in a secure location");
        int choice = getUserChoice(2);

        if (choice == 1) {
            setupAutomaticBackups();
        } else if (choice == 2) {
            storeBackupsSecurely();
        }
    }

    private static void trackOrder() {
        System.out.println("You track your order online and see that it's on its way. You can't wait to receive it!");
        System.out.println("1. Share your excitement on social media");
        System.out.println("2. Check the delivery status regularly");
        int choice = getUserChoice(2);

        if (choice == 1) {
            shareExcitement();
        } else if (choice == 2) {
            checkDeliveryStatus();
        }
    }

    private static void shareDeal() {
        System.out.println("You share the deal with your friends, and they thank you for the great find.");
        System.out.println("1. Look for more deals online");
        System.out.println("2. Join a deal-hunting community");
        int choice = getUserChoice(2);

        if (choice == 1) {
            lookForMoreDeals();
        } else if (choice == 2) {
            joinDealCommunity();
        }
    }

    private static void comparePrices() {
        System.out.println("You compare prices on other websites and find an even better deal. Score!");
        System.out.println("1. Purchase the item immediately");
        System.out.println("2. Add it to your wishlist for later");
        int choice = getUserChoice(2);

        if (choice == 1) {
            purchaseItem();
        } else if (choice == 2) {
            addToWishlist();
        }
    }

    private static void readReviews() {
        System.out.println("You read reviews and decide that the product is worth the purchase.");
        System.out.println("1. Buy the product");
        System.out.println("2. Wait for a sale");
        int choice = getUserChoice(2);

        if (choice == 1) {
            buyProduct();
        } else if (choice == 2) {
            waitForSale();
        }
    }

    private static void engageDiscussion() {
        System.out.println("You engage in the discussion and share your thoughts, sparking an interesting debate.");
        System.out.println("1. Continue the debate");
        System.out.println("2. End the discussion and move on");
        int choice = getUserChoice(2);

        if (choice == 1) {
            continueDebate();
        } else if (choice == 2) {
            endDiscussion();
        }
    }

    private static void leaveDiscussion() {
        System.out.println("You leave the discussion and continue browsing other topics.");
        System.out.println("1. Watch a video about the event");
        System.out.println("2. Look for more information online");
        int choice = getUserChoice(2);

        if (choice == 1) {
            watchVideo();
        } else if (choice == 2) {
            searchMoreInformation();
        }
    }

    private static void shareInformation() {
        System.out.println("You share the new information, and your post goes viral. People are impressed by your insight.");
        System.out.println("1. Respond to comments");
        System.out.println("2. Write a blog post about it");
        int choice = getUserChoice(2);

        if (choice == 1) {
            respondToComments();
        } else if (choice == 2) {
            writeBlogPost();
        }
    }

    private static void bookmarkSources() {
        System.out.println("You bookmark the sources, knowing they will be useful for future reference.");
        System.out.println("1. Organize your bookmarks");
        System.out.println("2. Share the sources with your friends");
        int choice = getUserChoice(2);

        if (choice == 1) {
            organizeBookmarks();
        } else if (choice == 2) {
            shareSources();
        }
    }

    private static void likePhoto() {
        System.out.println("You like the photo, showing your friend that you appreciated their post.");
        System.out.println("1. Comment on another post");
        System.out.println("2. Share another photo");
        int choice = getUserChoice(2);

        if (choice == 1) {
            commentAnotherPost();
        } else if (choice == 2) {
            shareAnotherPhoto();
        }
    }

    private static void sharePhotoAgain() {
        System.out.println("You share the photo again, and it spreads quickly among your social circle.");
        System.out.println("1. Start a photo caption contest");
        System.out.println("2. Create a photo collage");
        int choice = getUserChoice(2);

        if (choice == 1) {
            startCaptionContest();
        } else if (choice == 2) {
            createPhotoCollage();
        }
    }

    private static void createMeme() {
        System.out.println("You create a meme using the photo, and it quickly goes viral.");
        System.out.println("1. Share the meme on social media");
        System.out.println("2. Submit the meme to a contest");
        int choice = getUserChoice(2);

        if (choice == 1) {
            shareMeme();
        } else if (choice == 2) {
            submitMemeToContest();
        }
    }

    private static void startThread() {
        System.out.println("You start a photo-sharing thread, and it becomes a popular topic among your friends.");
        System.out.println("1. Continue posting in the thread");
        System.out.println("2. Start a new thread on a different topic");
        int choice = getUserChoice(2);

        if (choice == 1) {
            continuePosting();
        } else if (choice == 2) {
            startNewThread();
        }
    }

    private static void takePhotos() {
        System.out.println("You take photos during the hangout, capturing great memories.");
        System.out.println("1. Share the photos online");
        System.out.println("2. Create a photo album");
        int choice = getUserChoice(2);

        if (choice == 1) {
            sharePhotosOnline();
        } else if (choice == 2) {
            createPhotoAlbum();
        }
    }

    private static void shareExperienceOnline() {
        System.out.println("You share your experience on social media, and your friends love hearing about it.");
        System.out.println("1. Plan the next hangout");
        System.out.println("2. Share more stories from the hangout");
        int choice = getUserChoice(2);

        if (choice == 1) {
            planNextHangout();
        } else if (choice == 2) {
            shareMoreStories();
        }
    }

    private static void shareVideo() {
        System.out.println("You share a funny video, and it makes everyone laugh. Your friend appreciates the humor.");
        System.out.println("1. Find more funny videos to share");
        System.out.println("2. Plan another fun activity");
        int choice = getUserChoice(2);

        if (choice == 1) {
            findMoreVideos();
        } else if (choice == 2) {
            planActivity();
        }
    }

    private static void planMeetup() {
        System.out.println("You plan a future meetup, looking forward to spending more time with your friend.");
        System.out.println("1. Finalize the plans");
        System.out.println("2. Share the plans with others");
        int choice = getUserChoice(2);

        if (choice == 1) {
            finalizePlans();
        } else if (choice == 2) {
            sharePlans();
        }
    }

    private static void setupPasswordManager() {
        System.out.println("You set up a password manager, making it easier to keep track of all your accounts.");
        System.out.println("1. Import your existing passwords");
        System.out.println("2. Create new strong passwords");
        int choice = getUserChoice(2);

        if (choice == 1) {
            importPasswords();
        } else if (choice == 2) {
            createStrongPasswords();
        }
    }

    private static void enableNotifications() {
        System.out.println("You enable account activity notifications, so you're always aware of any changes.");
        System.out.println("1. Set up additional security measures");
        System.out.println("2. Monitor your account activity regularly");
        int choice = getUserChoice(2);

        if (choice == 1) {
            setupSecurityMeasures();
        } else if (choice == 2) {
            monitorAccountActivity();
        }
    }

    private static void subscribeNewsletter() {
        System.out.println("You subscribe to the blog's newsletter, ensuring you won't miss any future posts.");
        System.out.println("1. Share the blog on social media");
        System.out.println("2. Comment on a recent blog post");
        int choice = getUserChoice(2);

        if (choice == 1) {
            shareBlogOnSocialMedia();
        } else if (choice == 2) {
            commentOnBlogPost();
        }
    }

    private static void shareBlog() {
        System.out.println("You share the blog with your friends, and they thank you for the recommendation.");
        System.out.println("1. Discuss the blog with your friends");
        System.out.println("2. Look for other interesting blogs");
        int choice = getUserChoice(2);

        if (choice == 1) {
            discussBlogWithFriends();
        } else if (choice == 2) {
            lookForBlogs();
        }
    }

    private static void joinDiscussion() {
        System.out.println("You join the discussion on cybersecurity and learn a lot from other forum members.");
        System.out.println("1. Ask a question");
        System.out.println("2. Share your own knowledge");
        int choice = getUserChoice(2);

        if (choice == 1) {
            askQuestion();
        } else if (choice == 2) {
            shareKnowledge();
        }
    }

    private static void startTechThread() {
        System.out.println("You start a new thread about your tech issue, and several members offer helpful advice.");
        System.out.println("1. Thank the members for their help");
        System.out.println("2. Follow up with more details");
        int choice = getUserChoice(2);

        if (choice == 1) {
            thankMembers();
        } else if (choice == 2) {
            followUpWithDetails();
        }
    }

    private static void rateMovie() {
        System.out.println("You rate the movie and leave a thoughtful review for others to read.");
        System.out.println("1. Recommend the movie to a friend");
        System.out.println("2. Look for similar movies");
        int choice = getUserChoice(2);

        if (choice == 1) {
            recommendMovie();
        } else if (choice == 2) {
            lookForSimilarMovies();
        }
    }

    private static void shareThoughts() {
        System.out.println("You share your thoughts on the movie and spark a lively discussion.");
        System.out.println("1. Join the discussion");
        System.out.println("2. Start a new discussion");
        int choice = getUserChoice(2);

        if (choice == 1) {
            joinDiscussion();
        } else if (choice == 2) {
            startNewDiscussion();
        }
    }

    private static void browseRelatedMovies() {
        System.out.println("You browse related movies and find several that interest you.");
        System.out.println("1. Add the movies to your watchlist");
        System.out.println("2. Watch one of the movies now");
        int choice = getUserChoice(2);

        if (choice == 1) {
            addMoviesToWatchlist();
        } else if (choice == 2) {
            watchMovieNow();
        }
    }

    private static void planMovieNight() {
        System.out.println("You plan a movie night, inviting your friends over for a fun time.");
        System.out.println("1. Send out invitations");
        System.out.println("2. Pick the movie");
        int choice = getUserChoice(2);

        if (choice == 1) {
            sendInvitations();
        } else if (choice == 2) {
            pickMovie();
        }
    }

    private static void visitTechForum() {
        System.out.println("You visit a tech forum and find useful tips for optimizing your system.");
        System.out.println("1. Apply the tips");
        System.out.println("2. Share the tips with others");
        int choice = getUserChoice(2);

        if (choice == 1) {
            applyTips();
        } else if (choice == 2) {
            shareTips();
        }
    }

    private static void engageOnline() {
        System.out.println("You engage online and quickly gain followers for your insightful posts.");
        System.out.println("1. Continue engaging");
        System.out.println("2. Focus on creating content");
        int choice = getUserChoice(2);

        if (choice == 1) {
            continueEngaging();
        } else if (choice == 2) {
            createContent();
        }
    }

    private static void getTechHelp() {
        System.out.println("You get help from the tech forum and manage to solve your issue.");
        System.out.println("1. Thank the forum members");
        System.out.println("2. Share your solution with others");
        int choice = getUserChoice(2);

        if (choice == 1) {
            thankForumMembers();
        } else if (choice == 2) {
            shareSolution();
        }
    }

    private static void thankForumMembers() {
        System.out.println("You thank the forum members for their help, and they appreciate your gratitude.");
        System.out.println("1. Stay engaged with the forum");
        System.out.println("2. Explore other topics on the forum");
        int choice = getUserChoice(2);

        if (choice == 1) {
            stayEngaged();
        } else if (choice == 2) {
            exploreOtherTopics();
        }
    }

    private static void troubleshootIssue() {
        System.out.println("You troubleshoot the issue and manage to fix it on your own.");
        System.out.println("1. Share the fix online");
        System.out.println("2. Write a detailed guide");
        int choice = getUserChoice(2);

        if (choice == 1) {
            shareFixOnline();
        } else if (choice == 2) {
            writeGuide();
        }
    }

    private static void optimizeSystem() {
        System.out.println("You optimize your system, and it runs more efficiently than before.");
        System.out.println("1. Share your optimization tips");
        System.out.println("2. Test the system's performance");
        int choice = getUserChoice(2);

        if (choice == 1) {
            shareOptimizationTips();
        } else if (choice == 2) {
            testPerformance();
        }
    }

    private static void enhanceSecurity() {
        System.out.println("You enhance your system's security, ensuring your data is well-protected.");
        System.out.println("1. Share your security tips online");
        System.out.println("2. Continue securing other devices");
        int choice = getUserChoice(2);

        if (choice == 1) {
            shareSecurityTips();
        } else if (choice == 2) {
            secureOtherDevices();
        }
    }

    private static void upgradeComponents() {
        System.out.println("You upgrade your system components, improving performance.");
        System.out.println("1. Test the new components");
        System.out.println("2. Share the upgrade process online");
        int choice = getUserChoice(2);

        if (choice == 1) {
            testComponents();
        } else if (choice == 2) {
            shareUpgradeProcess();
        }
    }

    private static void installSoftware() {
        System.out.println("You install new software, gaining access to advanced features.");
        System.out.println("1. Test the software");
        System.out.println("2. Share your experience online");
        int choice = getUserChoice(2);

        if (choice == 1) {
            testSoftware();
        } else if (choice == 2) {
            shareExperienceOnline();
        }
    }

    private static void secureAccount() {
        System.out.println("You secure your online account, ensuring your personal information is protected.");
        System.out.println("1. Set up two-factor authentication");
        System.out.println("2. Monitor your account activity");
        int choice = getUserChoice(2);

        if (choice == 1) {
            setupTwoFactorAuthentication();
        } else if (choice == 2) {
            monitorAccount();
        }
    }

    private static void reviewSettings() {
        System.out.println("You review your system settings, making adjustments for better performance.");
        System.out.println("1. Optimize the settings");
        System.out.println("2. Share your configuration online");
        int choice = getUserChoice(2);

        if (choice == 1) {
            optimizeSettings();
        } else if (choice == 2) {
            shareConfiguration();
        }
    }

    private static void createBackup() {
        System.out.println("You create a backup of your system, ensuring your data is safe.");
        System.out.println("1. Store the backup securely");
        System.out.println("2. Test the backup to ensure it works");
        int choice = getUserChoice(2);

        if (choice == 1) {
            storeBackup();
        } else if (choice == 2) {
            testBackup();
        }
    }

    private static void restoreBackup() {
        System.out.println("You restore your system from a backup, recovering important data.");
        System.out.println("1. Verify the restoration was successful");
        System.out.println("2. Share your experience online");
        int choice = getUserChoice(2);

        if (choice == 1) {
            verifyRestoration();
        } else if (choice == 2) {
            shareExperience();
        }
    }

    private static void upgradeSecurity() {
        System.out.println("You upgrade your system's security measures, ensuring it's protected from the latest threats.");
        System.out.println("1. Test the new security features");
        System.out.println("2. Share your experience online");
        int choice = getUserChoice(2);

        if (choice == 1) {
            testSecurityFeatures();
        } else if (choice == 2) {
            shareExperience();
        }
    }

    private static void testSecurityFeatures() {
        System.out.println("You test the new security features, ensuring they are working correctly.");
        System.out.println("1. Share the results online");
        System.out.println("2. Continue enhancing security");
        int choice = getUserChoice(2);

        if (choice == 1) {
            shareResults();
        } else if (choice == 2) {
            enhanceSecurityFurther();
        }
    }

    private static void reviewSettingsAgain() {
        System.out.println("You review your security settings, making sure everything is up-to-date.");
        System.out.println("1. Enhance security even further");
        System.out.println("2. Share your settings online");
        int choice = getUserChoice(2);

        if (choice == 1) {
            enhanceSecurityFurther();
        } else if (choice == 2) {
            shareSettings();
        }
    }

    private static void verifySettings() {
        System.out.println("You verify your security settings, confirming that your system is secure.");
        System.out.println("1. Share your verification process online");
        System.out.println("2. Continue securing other devices");
        int choice = getUserChoice(2);

        if (choice == 1) {
            shareVerificationProcess();
        } else if (choice == 2) {
            secureOtherDevices();
        }
    }

    private static void maintainSecurity() {
        System.out.println("You maintain your system's security, keeping it protected from potential threats.");
        System.out.println("1. Share your maintenance process online");
        System.out.println("2. Explore advanced security measures");
        int choice = getUserChoice(2);

        if (choice == 1) {
            shareMaintenanceProcess();
        } else if (choice == 2) {
            exploreAdvancedSecurity();
        }
    }

    private static void shareOptimizationTips() {
        System.out.println("You share your optimization tips, helping others improve their systems.");
        System.out.println("1. Continue sharing tips");
        System.out.println("2. Focus on optimizing your own system");
        int choice = getUserChoice(2);

        if (choice == 1) {
            continueSharingTips();
        } else if (choice == 2) {
            optimizeOwnSystem();
        }
    }

    private static void testPerformance() {
        System.out.println("You test your system's performance, ensuring it runs smoothly.");
        System.out.println("1. Share the results online");
        System.out.println("2. Continue testing other components");
        int choice = getUserChoice(2);

        if (choice == 1) {
            sharePerformanceResults();
        } else if (choice == 2) {
            continueTesting();
        }
    }

    private static void enhanceSecurityFurther() {
        System.out.println("You enhance your system's security even further, leaving no vulnerabilities.");
        System.out.println("1. Share your security tips online");
        System.out.println("2. Continue securing other devices");
        int choice = getUserChoice(2);

        if (choice == 1) {
            shareSecurityTips();
        } else if (choice == 2) {
            secureOtherDevices();
        }
    }

    private static void shareSettings() {
        System.out.println("You share your security settings online, helping others protect their systems.");
        System.out.println("1. Continue sharing tips");
        System.out.println("2. Focus on securing your own system");
        int choice = getUserChoice(2);

        if (choice == 1) {
            continueSharingTips();
        } else if (choice == 2) {
            secureOwnSystem();
        }
    }

    private static void shareVerificationProcess() {
        System.out.println("You share your verification process online, helping others confirm their security.");
        System.out.println("1. Continue sharing tips");
        System.out.println("2. Focus on securing your own system");
        int choice = getUserChoice(2);

        if (choice == 1) {
            continueSharingTips();
        } else if (choice == 2) {
            secureOwnSystem();
        }
    }

    private static void secureOtherDevices() {
        System.out.println("You secure other devices, ensuring your entire network is protected.");
        System.out.println("1. Share your process online");
        System.out.println("2. Explore other security options");
        int choice = getUserChoice(2);

        if (choice == 1) {
            shareProcess();
        } else if (choice == 2) {
            exploreSecurityOptions();
        }
    }

    private static void shareProcess() {
        System.out.println("You share your process online, helping others secure their networks.");
        System.out.println("1. Continue sharing tips");
        System.out.println("2. Focus on securing your own system");
        int choice = getUserChoice(2);

        if (choice == 1) {
            continueSharingTips();
        } else if (choice == 2) {
            secureOwnSystem();
        }
    }

    private static void exploreSecurityOptions() {
        System.out.println("You explore other security options, finding new ways to protect your system.");
        System.out.println("1. Implement the new security measures");
        System.out.println("2. Share your findings online");
        int choice = getUserChoice(2);

        if (choice == 1) {
            implementSecurityMeasures();
        } else if (choice == 2) {
            shareFindings();
        }
    }

    private static void implementSecurityMeasures() {
        System.out.println("You implement the new security measures, ensuring your system is protected.");
        System.out.println("1. Share your security tips online");
        System.out.println("2. Continue securing other devices");
        int choice = getUserChoice(2);

        if (choice == 1) {
            shareSecurityTips();
        } else if (choice == 2) {
            secureOtherDevices();
        }
    }

    private static void shareFindings() {
        System.out.println("You share your findings online, helping others protect their systems.");
        System.out.println("1. Continue sharing tips");
        System.out.println("2. Focus on securing your own system");
        int choice = getUserChoice(2);

        if (choice == 1) {
            continueSharingTips();
        } else if (choice == 2) {
            secureOwnSystem();
        }
    }

    private static void secureOwnSystem() {
        System.out.println("You secure your own system, ensuring it is protected from potential threats.");
        System.out.println("1. Share your security tips online");
        System.out.println("2. Explore other security options");
        int choice = getUserChoice(2);

        if (choice == 1) {
            shareSecurityTips();
        } else if (choice == 2) {
            exploreSecurityOptions();
        }
    }

    private static void createContent() {
        System.out.println("You focus on creating content, attracting a dedicated audience.");
        System.out.println("1. Continue creating content");
        System.out.println("2. Engage with your audience");
        int choice = getUserChoice(2);

        if (choice == 1) {
            continueCreatingContent();
        } else if (choice == 2) {
            engageAudience();
        }
    }

    private static void continueEngaging() {
        System.out.println("You continue engaging online, growing your influence even further.");
        System.out.println("1. Share your tips for engagement");
        System.out.println("2. Focus on creating content");
        int choice = getUserChoice(2);

        if (choice == 1) {
            shareEngagementTips();
        } else if (choice == 2) {
            createContent();
        }
    }

    private static void shareExperience() {
        System.out.println("You share your experience online, helping others recover their data.");
        System.out.println("1. Continue sharing tips");
        System.out.println("2. Focus on backing up your own data");
        int choice = getUserChoice(2);

        if (choice == 1) {
            continueSharingTips();
        } else if (choice == 2) {
            backupOwnData();
        }
    }

    private static void continueTesting() {
        System.out.println("You continue testing your system, ensuring everything runs smoothly.");
        System.out.println("1. Share your test results online");
        System.out.println("2. Focus on optimizing your system");
        int choice = getUserChoice(2);

        if (choice == 1) {
            shareTestResults();
        } else if (choice == 2) {
            optimizeSystem();
        }
    }

    private static void shareOptimizationTips() {
        System.out.println("You share your optimization tips online, helping others improve their systems.");
        System.out.println("1. Continue sharing tips");
        System.out.println("2. Focus on optimizing your own system");
        int choice = getUserChoice(2);

        if (choice == 1) {
            continueSharingTips();
        } else if (choice == 2) {
            optimizeOwnSystem();
        }
    }

    private static void shareSecurityTips() {
        System.out.println("You share your security tips online, helping others protect their systems.");
        System.out.println("1. Continue sharing tips");
        System.out.println("2. Focus on securing your own system");
        int choice = getUserChoice(2);

        if (choice == 1) {
            continueSharingTips();
        } else if (choice == 2) {
            secureOwnSystem();
        }
    }

    private static void shareUpgradeProcess() {
        System.out.println("You share the upgrade process online, helping others improve their systems.");
        System.out.println("1. Continue sharing tips");
        System.out.println("2. Focus on upgrading your own system");
        int choice = getUserChoice(2);

        if (choice == 1) {
            continueSharingTips();
        } else if (choice == 2) {
            upgradeOwnSystem();
        }
    }

    private static void shareFixOnline() {
        System.out.println("You share the fix online, helping others solve similar issues.");
        System.out.println("1. Continue sharing tips");
        System.out.println("2. Focus on fixing your own system");
        int choice = getUserChoice(2);

        if (choice == 1) {
            continueSharingTips();
        } else if (choice == 2) {
            fixOwnSystem();
        }
    }

    private static void exploreOtherTopics() {
        System.out.println("You explore other topics on the forum, finding new areas of interest.");
        System.out.println("1. Join a discussion on a new topic");
        System.out.println("2. Start a new discussion");
        int choice = getUserChoice(2);

        if (choice == 1) {
            joinDiscussion();
        } else if (choice == 2) {
            startNewDiscussion();
        }
    }

    private static void stayEngaged() {
        System.out.println("You stay engaged with the forum, contributing valuable insights.");
        System.out.println("1. Continue engaging with the community");
        System.out.println("2. Explore other forums");
        int choice = getUserChoice(2);

        if (choice == 1) {
            continueEngagingWithCommunity();
        } else if (choice == 2) {
            exploreOtherForums();
        }
    }

    private static void shareEngagementTips() {
        System.out.println("You share your engagement tips online, helping others grow their influence.");
        System.out.println("1. Continue sharing tips");
        System.out.println("2. Focus on growing your own influence");
        int choice = getUserChoice(2);

        if (choice == 1) {
            continueSharingTips();
        } else if (choice == 2) {
            growOwnInfluence();
        }
    }

    private static void continueEngagingWithCommunity() {
        System.out.println("You continue engaging with the community, becoming a respected member.");
        System.out.println("1. Share your experiences");
        System.out.println("2. Focus on contributing more");
        int choice = getUserChoice(2);

        if (choice == 1) {
            shareExperiences();
        } else if (choice == 2) {
            contributeMore();
        }
    }

    private static void exploreOtherForums() {
        System.out.println("You explore other forums, finding new communities to engage with.");
        System.out.println("1. Join a discussion in a new forum");
        System.out.println("2. Start a new discussion in a different forum");
        int choice = getUserChoice(2);

        if (choice == 1) {
            joinDiscussionInNewForum();
        } else if (choice == 2) {
            startNewDiscussionInDifferentForum();
        }
    }

    private static void growOwnInfluence() {
        System.out.println("You focus on growing your own influence, becoming a leader in the community.");
        System.out.println("1. Continue growing your influence");
        System.out.println("2. Share your tips for success");
        int choice = getUserChoice(2);

        if (choice == 1) {
            continueGrowingInfluence();
        } else if (choice == 2) {
            shareSuccessTips();
        }
    }

    private static void shareExperiences() {
        System.out.println("You share your experiences online, helping others navigate similar situations.");
        System.out.println("1. Continue sharing tips");
        System.out.println("2. Focus on gaining new experiences");
        int choice = getUserChoice(2);

        if (choice == 1) {
            continueSharingTips();
        } else if (choice == 2) {
            gainNewExperiences();
        }
    }

    private static void contributeMore() {
        System.out.println("You focus on contributing more to the community, becoming a valuable member.");
        System.out.println("1. Continue contributing");
        System.out.println("2. Share your contributions online");
        int choice = getUserChoice(2);

        if (choice == 1) {
            continueContributing();
        } else if (choice == 2) {
            shareContributionsOnline();
        }
    }

    private static void continueGrowingInfluence() {
        System.out.println("You continue growing your influence, attracting a larger following.");
        System.out.println("1. Share your success story online");
        System.out.println("2. Focus on maintaining your influence");
        int choice = getUserChoice(2);

        if (choice == 1) {
            shareSuccessStory();
        } else if (choice == 2) {
            maintainInfluence();
        }
    }

    private static void shareSuccessTips() {
        System.out.println("You share your success tips online, helping others achieve their goals.");
        System.out.println("1. Continue sharing tips");
        System.out.println("2. Focus on achieving new goals");
        int choice = getUserChoice(2);

        if (choice == 1) {
            continueSharingTips();
        } else if (choice == 2) {
            achieveNewGoals();
        }
    }

    private static void joinDiscussionInNewForum() {
        System.out.println("You join a discussion in a new forum, expanding your reach.");
        System.out.println("1. Continue engaging in the discussion");
        System.out.println("2. Explore other discussions");
        int choice = getUserChoice(2);

        if (choice == 1) {
            continueEngagingInDiscussion();
        } else if (choice == 2) {
            exploreOtherDiscussions();
        }
    }

    private static void startNewDiscussionInDifferentForum() {
        System.out.println("You start a new discussion in a different forum, sparking interest.");
        System.out.println("1. Continue the discussion");
        System.out.println("2. Start another discussion");
        int choice = getUserChoice(2);

        if (choice == 1) {
            continueDiscussion();
        } else if (choice == 2) {
            startAnotherDiscussion();
        }
    }

    private static void gainNewExperiences() {
        System.out.println("You focus on gaining new experiences, broadening your horizons.");
        System.out.println("1. Share your new experiences online");
        System.out.println("2. Continue exploring new opportunities");
        int choice = getUserChoice(2);

        if (choice == 1) {
            shareNewExperiences();
        } else if (choice == 2) {
            continueExploring();
        }
    }

    private static void continueContributing() {
        System.out.println("You continue contributing to the community, making a positive impact.");
        System.out.println("1. Share your contributions online");
        System.out.println("2. Focus on making more contributions");
        int choice = getUserChoice(2);

        if (choice == 1) {
            shareContributionsOnline();
        } else if (choice == 2) {
            makeMoreContributions();
        }
    }

    private static void shareSuccessStory() {
        System.out.println("You share your success story online, inspiring others.");
        System.out.println("1. Continue sharing tips");
        System.out.println("2. Focus on achieving new successes");
        int choice = getUserChoice(2);

        if (choice == 1) {
            continueSharingTips();
        } else if (choice == 2) {
            achieveNewSuccesses();
        }
    }

    private static void maintainInfluence() {
        System.out.println("You focus on maintaining your influence, keeping your audience engaged.");
        System.out.println("1. Continue engaging with your audience");
        System.out.println("2. Focus on creating more content");
        int choice = getUserChoice(2);

        if (choice == 1) {
            continueEngagingWithAudience();
        } else if (choice == 2) {
            createMoreContent();
        }
    }

    private static void achieveNewGoals() {
        System.out.println("You focus on achieving new goals, setting your sights on the future.");
        System.out.println("1. Share your new goals online");
        System.out.println("2. Focus on accomplishing those goals");
        int choice = getUserChoice(2);

        if (choice == 1) {
            shareNewGoals();
        } else if (choice == 2) {
            accomplishGoals();
        }
    }

    private static void continueEngagingInDiscussion() {
        System.out.println("You continue engaging in the discussion, sharing your insights.");
        System.out.println("1. Share your thoughts online");
        System.out.println("2. Explore other discussions");
        int choice = getUserChoice(2);

        if (choice == 1) {
            shareThoughtsOnline();
        } else if (choice == 2) {
            exploreOtherDiscussions();
        }
    }

    private static void exploreOtherDiscussions() {
        System.out.println("You explore other discussions, finding new topics to engage with.");
        System.out.println("1. Join a discussion on a new topic");
        System.out.println("2. Start a new discussion");
        int choice = getUserChoice(2);

        if (choice == 1) {
            joinDiscussion();
        } else if (choice == 2) {
            startNewDiscussion();
        }
    }

    private static void shareNewExperiences() {
        System.out.println("You share your new experiences online, helping others explore new opportunities.");
        System.out.println("1. Continue sharing tips");
        System.out.println("2. Focus on gaining more experiences");
        int choice = getUserChoice(2);

        if (choice == 1) {
            continueSharingTips();
        } else if (choice == 2) {
            gainMoreExperiences();
        }
    }

    private static void continueExploring() {
        System.out.println("You continue exploring new opportunities, expanding your knowledge.");
        System.out.println("1. Share your findings online");
        System.out.println("2. Focus on finding more opportunities");
        int choice = getUserChoice(2);

        if (choice == 1) {
            shareFindingsOnline();
        } else if (choice == 2) {
            findMoreOpportunities();
        }
    }

    private static void makeMoreContributions() {
        System.out.println("You focus on making more contributions, becoming an integral part of the community.");
        System.out.println("1. Share your contributions online");
        System.out.println("2. Focus on contributing even more");
        int choice = getUserChoice(2);

        if (choice == 1) {
            shareContributionsOnline();
        } else if (choice == 2) {
            contributeEvenMore();
        }
    }

    private static void accomplishGoals() {
        System.out.println("You focus on accomplishing your goals, driving yourself toward success.");
        System.out.println("1. Share your success story online");
        System.out.println("2. Set new goals to achieve");
        int choice = getUserChoice(2);

        if (choice == 1) {
            shareSuccessStory();
        } else if (choice == 2) {
            setNewGoals();
        }
    }

    private static void contributeEvenMore() {
        System.out.println("You focus on contributing even more, becoming a key member of the community.");
        System.out.println("1. Share your contributions online");
        System.out.println("2. Focus on making an even bigger impact");
        int choice = getUserChoice(2);

        if (choice == 1) {
            shareContributionsOnline();
        } else if (choice == 2) {
            makeBiggerImpact();
        }
    }
}
