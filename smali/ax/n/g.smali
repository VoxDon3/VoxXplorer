.class public final synthetic Lax/n/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Ljava/lang/Runnable;

.field public final synthetic q:Lax/n/f$c;


# direct methods
.method public synthetic constructor <init>(Lax/n/f$c;Ljava/lang/Runnable;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/n/g;->q:Lax/n/f$c;

    iput-object p2, p0, Lax/n/g;->c0:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/n/g;->q:Lax/n/f$c;

    iget-object v1, p0, Lax/n/g;->c0:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lax/n/f$c;->a(Lax/n/f$c;Ljava/lang/Runnable;)V

    return-void
.end method
